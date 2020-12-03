package domain.items;

public interface CustomerRepository {
    Iterable <Customer> findAll() throws CustomerNotFound, DBException;
    Customer find(int parseInt) ;
    Customer commitCustomer(Customer customer) throws DBException;
}
