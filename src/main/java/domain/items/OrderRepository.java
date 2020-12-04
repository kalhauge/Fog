package domain.items;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll() ;
    Order find(String kundeNavn) ;
    int commit(Order order);

}