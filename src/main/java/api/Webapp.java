package api;

import domain.items.*;

import java.util.List;

public class Webapp {
    private final static int VERSION = 1;
    private final static String TITLE = "Fog";
    private final OrderRepository orderList;
    private final CustomerRepository customers;
    private final CarportRepository carports;

    public Webapp(OrderRepository orderList, CustomerRepository customers,CarportRepository carports) {
        this.orderList=orderList;
        this.customers=customers;
        this.carports=carports;
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
    public Customer findKunde(int Id){return customers.find(Id);}
    public Carport findcarport(int Id) throws DBException {return carports.find(Id);}
}
