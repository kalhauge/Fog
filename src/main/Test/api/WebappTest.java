package api;

import domain.items.DBException;
import domain.items.Order;
import infrastructure.DBCarportRepository;
import infrastructure.DBCustomerRepository;
import infrastructure.DBOrderRepository;
import infrastructure.Database;
import junit.framework.TestCase;

import java.sql.SQLException;
import java.time.LocalDate;

public class WebappTest extends TestCase {

    public void testCommitOrder() throws DBException, SQLException {
        Order order=new Order(LocalDate.now(),null,null,"jens@gamil.com",1,1,100000,"bestilling");
        Database db=new Database();
        Webapp api=new Webapp(new DBOrderRepository(db), new DBCustomerRepository(db), new DBCarportRepository(db) );
        int id=api.commitOrder(order);
        System.out.println(id);
        order=api.findOrder(id);
        System.out.println(order);
        api.findAllOrders();
    }
}