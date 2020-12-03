package api;

import domain.items.Order;
import infrastructure.DBCarportRepository;
import infrastructure.DBCustomerRepository;
import infrastructure.DBOrderRepository;
import infrastructure.Database;
import junit.framework.TestCase;

public class WebappTest extends TestCase {

    public void testCommitOrder() {
        Order order=new Order(null,null,null,"jens@gamil.com",1,1,100000,"bestilling");
        Database db=new Database();
        Webapp api=new Webapp(new DBOrderRepository(db), new DBCustomerRepository(), new DBCarportRepository(db) );
        api.commitOrder(order);

    }
}