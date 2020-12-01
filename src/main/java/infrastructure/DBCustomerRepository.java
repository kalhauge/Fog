package infrastructure;

import domain.items.Customer;
import domain.items.CustomerRepository;

public class DBCustomerRepository implements CustomerRepository {
    @Override
    public Iterable<Customer> findAll() {
        return null;
    }

    @Override
    public Customer find(int parseInt) {
        if(parseInt==1) return new Customer("Jens","","jens@gmail.com",12345678,1,null,null);
        if( parseInt==2)return new Customer("Gustav Bidstrup","","bidstrup@gmail.com",12345678,2,null,null);
        return null;
    }
}
