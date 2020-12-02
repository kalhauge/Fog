package domain.items;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll() ;
    Order find(int parseInt) ;
    int commit(Order order);

}