package api;

import domain.items.*;


import java.sql.SQLException;

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

    public  List<Order> findAllOrders() throws SQLException {
       return orders.findAll();
    }

    public Customer findKunde(int Id){return customers.find(Id);}
    public Carport findCarport(int Id) throws DBException {return carports.find(Id);}

  

    public int commitOrder(Order order){return orders.commit(order);};
    public Order findOrder(int id) throws DBException {return orders.find(id);}

    public Customer commitCustomer(Customer customer) throws DBException {
        return customers.commitCustomer(customer);
    }
    public int commitCarport(Carport carport) throws SQLException {
       return carports.commit(carport);

    }


}
