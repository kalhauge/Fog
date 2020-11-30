package infrastructure;

import domain.items.*;

import java.time.LocalDate;
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

        Order o4=new Order(4,2,4,75000,"afslået");
        o4.setTilbudsdato(LocalDate.of(2020,11,10));

        List<Order> orderlist=new ArrayList<>();
        orderlist.add(o1);orderlist.add(o2);orderlist.add(o3);orderlist.add(o4);
        return orderlist;
    }

    @Override
    public Customer find(int parseInt) {
        return null;
    }
}
