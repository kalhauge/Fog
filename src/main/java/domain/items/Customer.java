package domain.items;

public class Customer {
    String name;
    String adress;
    String email;
    int phoneNumber;
    int customerID;

    public Customer(String name, String adress, String email, int phoneNumber, int customerID) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
