package infrastructure;

import domain.items.Carport;
import domain.items.CarportRepository;

import domain.items.DBException;

public class DBCarportRepository implements CarportRepository {


    @Override
    public Iterable<Carport> findAll() throws DBException {

        return null;
    }

    @Override

    public Carport find(int parseInt) throws DBException {
        return null;

    }
}
