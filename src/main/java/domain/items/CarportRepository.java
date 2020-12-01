package domain.items;

public interface CarportRepository {

    Iterable <Carport> findAll() throws DBException;
    Carport find(int parseInt) throws DBException;

    Carport commitCarport(Carport carport);

    // CarportFactory create();
}