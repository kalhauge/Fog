package api;

import domain.items.*;

import java.time.LocalDate;
import java.util.List;

public class Webapp {
    private final static int VERSION = 1;
    private final static String TITLE = "Fog";
    private final OrderRepository orderList;
    private final CarportRepository carportList;

    
    public Webapp(OrderRepository orderList, CarportRepository carportList) {
        this.orderList=orderList;
        this.carportList = carportList;
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
