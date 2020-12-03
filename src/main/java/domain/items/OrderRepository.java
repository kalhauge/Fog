package domain.items;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll() ;
    Order find(int id) throws DBException;
    int commit(Order order);

}