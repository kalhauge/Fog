package infrastructure;

import domain.items.Customer;
import domain.items.Order;
import domain.items.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class DBOrderRepository implements OrderRepository {
    private final Database db;
    public DBOrderRepository(Database db) {
        this.db = db;
    }

    @Override
    public List<Order> findAll() {
        Order o1=new Order(1,new Customer("Jens","","jens@gmail.com",1345688,1,null,null),100000);
        Order o2=new Order(2,new Customer("Peter","","jpeter@gmail.com",1345688,1,null,null),100000);
        Order o3=new Order(3,new Customer("Gustav","","gustav@gmail.com",1345688,1,null,null),100000);
        Order o4=new Order(4,new Customer("Kristian","","morten@gmail.com",1345688,1,null,null),100000);
        List<Order> orderlist=new ArrayList<>();
        orderlist.add(o1);orderlist.add(o2);orderlist.add(o3);orderlist.add(o4);
        return orderlist;
    }

    @Override
    public Customer find(int parseInt) {
        return null;
    }
}
