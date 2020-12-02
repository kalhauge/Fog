package infrastructure;

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
    public Order find(String kundenavn) {
        return null;
    }

    @Override
    public int commit(Order order) {
        int id = 0;
        try {
            Connection con = db.getConnection();
            String SQL = "INSERT INTO ordre (tilbudsDato,ordreDato,leveringsDato,kundeNavn,sælgerId,carportId,pris,status) VALUES (?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, java.sql.Timestamp.valueOf(LocalDateTime.now()));//
            ps.setTimestamp(2, java.sql.Timestamp.valueOf(LocalDateTime.now()));
            ps.setTimestamp(3, java.sql.Timestamp.valueOf(LocalDateTime.now()));
            ps.setString(4, order.getKundeNavn());
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
