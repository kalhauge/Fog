package domain.items;

public interface CarportRepository {
    Iterable <Carport> findAll() ;
    Carport find(int parseInt) ;
}
