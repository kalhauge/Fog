package infrastructure;

import domain.items.Carport;
import domain.items.CarportRepository;

import domain.items.DBException;

import java.sql.*;
import java.util.List;

public class DBCarportRepository implements CarportRepository {

    private final Database db;
    public DBCarportRepository(Database db) {
        this.db = db;
    }


    @Override
    public List<Carport> findAll() throws DBException {
        return null;
    }

    @Override

    public Carport find(int parseInt) throws DBException {
        if (parseInt==1) return new Carport(3500,7000,false,"trapez",0,0);
        if (parseInt==2) return new Carport(4000,8000,false,"trapez",0,0);
        if (parseInt==3) return new Carport(4000,8000,true,"tagsten",3700,2000);
        if (parseInt==4) return new Carport(4000,8000,true,"tagsten",0,0);

        return null;

    }

    @Override
    public int commitCarport(Carport carport) throws SQLException {
        int id = 0;
        try {
            Connection con = db.getConnection();
            String SQL = "INSERT INTO carport (bredde, længde, rejsning, tag, skurBredde, skurLængde) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, carport.getWidth());
            System.out.println("4 " + carport.getWidth());
            ps.setInt(2, carport.getLenght());
            ps.setBoolean(3, carport.getRejsning());
            ps.setString(4, carport.getTag());
            ps.setInt(5, carport.getShedWidth());
            ps.setInt(6, carport.getShedLength());
            System.out.println("5 " + carport.getShedLength());
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