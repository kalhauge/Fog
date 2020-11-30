package domain.items;

public interface CustomerRepository {
    Iterable <Customer> findAll() ;
    Customer find(int parseInt) ;
}
