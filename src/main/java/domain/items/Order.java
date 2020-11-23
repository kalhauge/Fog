package domain.items;

public class Order {
    int orderID;
    Customer customer;
    int price;

    public Order(int orderID, Customer customer, int price) {
        this.orderID = orderID;
        this.customer = customer;
        this.price = price;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
