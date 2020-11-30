package domain.items;

public interface ShedRepository {
    Iterable <Shed> findAll() ;
    Shed find(int parseInt) ;
}
