package api;

import domain.items.*;

import java.util.List;

public class Webapp {
    private final static int VERSION = 1;
    private final static String TITLE = "Fog";

    private final OrderRepository orders;
    private final CustomerRepository customers;
    private final CarportRepository carports;

    public Webapp(OrderRepository orders, CustomerRepository customers,CarportRepository carports) {
        this.orders =orders;
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
       return orders.findAll();
    }

    public Customer findKunde(int Id){return customers.find(Id);}
    public Carport findCarport(int Id) throws DBException {return carports.find(Id);}
    public int commitCarport(Carport carport)  {return carports.commit(carport);};

    public int commitOrder(Order order){return orders.commit(order);};
}
