package api;

import domain.items.Order;
import domain.items.OrderRepository;

import java.util.List;

public class Webapp {
    private final static int VERSION = 1;
    private final static String TITLE = "Fog";
    private final OrderRepository orderList;
  ;
    
    public Webapp(OrderRepository orderList) {
        this.orderList=orderList;

    }
    
    public static int getVersion() {
        return VERSION;
    }
    
    public static String getTitle() {
        return TITLE;
    }
    public  List<Order> findAllOrders(){
       return orderList.findAll();
    }


    

}
