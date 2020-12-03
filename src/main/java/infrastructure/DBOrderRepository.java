package infrastructure;

import api.Utils;
import domain.items.*;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DBOrderRepository implements OrderRepository {
    private final Database db;
    public DBOrderRepository(Database db) {
        this.db = db;
    }

    @Override
    public List<Order> findAll() {
        Order o1=new Order(1,1,1,100000,"tilbud");
        o1.setTilbudsdato(LocalDate.of(2020,11,25));
        Order o2=new Order(2,1,2,12000,"tilbud");
        o2.setTilbudsdato(LocalDate.of(2020,11,25));

        Order o3=new Order(3,2,3,50000,"ordre");
        o3.setTilbudsdato(LocalDate.of(2020,11,10));
        o3.setOrdredato(LocalDate.of(2020,11,17));
        o3.setLeveringsDato(LocalDate.of(2021,02,12));

        Order o4=new Order(4,2,4,75000,"afslået");
        o4.setTilbudsdato(LocalDate.of(2020,11,10));

        List<Order> orderlist=new ArrayList<>();
        orderlist.add(o1);orderlist.add(o2);orderlist.add(o3);orderlist.add(o4);
        return orderlist;
    }

    @Override
    public Order find(int id) throws DBException {

        try {
            Connection con = db.getConnection();
            String SQL = "SELECT * FROM ordre WHERE id=(?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LocalDate tilbudsDato= Utils.timestampToLocalDate(rs.getTimestamp("tilbudsDato"));
                LocalDate ordreDato=Utils.timestampToLocalDate(rs.getTimestamp("ordreDato"));
                LocalDate leveringsDato=Utils.timestampToLocalDate(rs.getTimestamp("leveringsDato"));
                String eamil=rs.getString("kundeEmail");
                int saelgerId=rs.getInt("sælgerID");
                int carportId=rs.getInt("carportid");
                int pris=rs.getInt("pris");
                String status=rs.getString("status");
                Order order=new Order (tilbudsDato,ordreDato,leveringsDato,eamil,saelgerId,carportId,pris,status);
                order.setOrderID(id);
                return order;
            }
            } catch ( SQLException ex) {
            throw new DBException(ex.getMessage());
        }
        return null;
    }












    @Override
    public int commit(Order order) {
        int id = 0;
        try {
            Connection con = db.getConnection();
            String SQL = "INSERT INTO ordre (tilbudsDato,ordreDato,leveringsDato,kundeEmail,sælgerId,carportId,pris,status) VALUES (?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, java.sql.Timestamp.valueOf(order.getTilbudsdato().atStartOfDay()));
            if(order.getOrdredato()!=null){
                ps.setTimestamp(2, java.sql.Timestamp.valueOf(order.getOrdredato().atStartOfDay()));
            }else {ps.setTimestamp(2,null);}

            if(order.getLeveringsDato()!=null) {
                ps.setTimestamp(3, java.sql.Timestamp.valueOf(order.getLeveringsDato().atStartOfDay()));
            }else {ps.setTimestamp(3,null);}
            ps.setString(4, order.getKundeEmail());
            ps.setInt(5, order.getSaelgerId());
            ps.setInt(6, order.getCarportId());
            ps.setInt(7, order.getPrice());
            ps.setString(8, order.getStatus());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            } else {
                System.out.println("else");
                throw new RuntimeException("Unexpected error");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return id;
    }
}
