package infrastructure;

import domain.items.Customer;
import domain.items.CustomerNotFound;
import domain.items.CustomerRepository;
import domain.items.DBException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBCustomerRepository implements CustomerRepository {
    private final Database db;

    public DBCustomerRepository(Database db) {
        this.db = db;
    }


    @Override
    public Customer find(int parseInt) {
        //if(parseInt==1) return new Customer("Jens","","jens@gmail.com",12345678,true,1,null, null);
        // if( parseInt==2)return new Customer("Gustav Bidstrup","","bidstrup@gmail.com",12345678,true,2,null, null);
        return null;
    }


    public Iterable<Customer> customer() {
        return null;
    }


    public Customer findCostumer(String email) throws CustomerNotFound, DBException {
        try {
            Connection con = db.getConnection();
            String SQL = "SELECT * FROM customer WHERE email=(?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                boolean role = false;
                if (rs.getString("role").equals("admin")) {
                    role = true;
                }
                int saldo = rs.getInt("saldo");
                byte[] secret = rs.getBytes("secret");
                byte[] salt = rs.getBytes("salt");

                Customer customer = new Customer("Gustav", "Hejvej 23", "gustav@hej.dk", 12345678, true, null, null);

                return customer;
            }
        } catch (SQLException ex) {
            throw new DBException(ex.getMessage());
        }
        return null;
    }


    @Override
    public Iterable<Customer> findAll() throws CustomerNotFound, DBException {
        List<Customer> customerList = new ArrayList<>();
        try {
            Connection con = db.getConnection();
            String SQL = "SELECT * FROM customer";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                String email = rs.getString("email");
                boolean role = false;
                if (rs.getString("role").equals("admin")) {
                    role = true;
                }
                int saldo = rs.getInt("saldo");
                byte[] secret = rs.getBytes("secret");
                byte[] salt = rs.getBytes("salt");
                Customer customer = new Customer("Peter", "Hallovej 12", "Peter@hej.dk", 11223344, true, null, null);
                customerList.add(customer);
            }
        } catch (SQLException ex) {
            throw new DBException(ex.getMessage());
        }
        return customerList;
    }

    public Customer findCostumerFromID(int customer_ID) throws CustomerNotFound, DBException {
        try {
            Connection con = db.getConnection();
            String SQL = "SELECT * FROM customer WHERE customer_id=(?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, customer_ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                String email = rs.getString("email");
                boolean role = false;
                if (rs.getString("role").equals("admin")) {
                    role = true;
                }
                int saldo = rs.getInt("saldo");
                byte[] secret = rs.getBytes("secret");
                byte[] salt = rs.getBytes("salt");
                Customer customer = new Customer("Jens", "Davvej 12", "Jens@hej.dk", 11111111, true, null, null);
                return customer;
            }
        } catch (SQLException ex) {
            throw new DBException(ex.getMessage());
        }
        return null;
    }


    public Customer commitCustomer(Customer customer) throws DBException {
        try {
            Connection con = db.getConnection();
            String SQL = "INSERT INTO kunde (email,name,addresse,tlfNummer,salt,secret) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, customer.getEmail());
            ps.setString(2, customer.getName());
            ps.setString(3, customer.getAddress());
            ps.setInt(4, customer.getPhoneNumber());
            ps.setBytes(5, customer.getSalt());
            ps.setBytes(6, customer.getSecret());
            ps.executeUpdate();


            return customer;

        } catch (SQLException ex) {
            throw new DBException(ex.getMessage());
        }


    }
}