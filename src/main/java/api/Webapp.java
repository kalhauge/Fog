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

    public  List<Order> findAllOrders(){
       return orders.findAll();
    }


    public Carport findCarport(int Id) throws DBException {return carports.find(Id);}


    public Customer findCustomer(String email) throws DBException, CustomerNotFound {
        return customers.findCustomer(email);
    }
    public List<Customer> findAllCustomers() throws DBException, CustomerNotFound {
        return (List<Customer>) customers.findAll();
    }

  

    public int commitOrder(Order order){return orders.commit(order);};



    public Customer commitCustomer(Customer customer) throws DBException {
        return customers.commitCustomer(customer);
    }
    public int commitCarport(Carport carport) throws SQLException {
       return carports.commit(carport);

    }


}
