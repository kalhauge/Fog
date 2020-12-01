package infrastructure;

import domain.items.Carport;
import domain.items.CarportFactory;
import domain.items.CarportRepository;

import domain.items.DBException;

public class DBCarportRepository implements CarportRepository {

    private final Database db;
    public DBCarportRepository(Database db) {
        this.db = db;
    }

    @Override
    public Iterable<Carport> findAll() throws DBException {
        return null;
    }

    @Override

    public Carport find(int parseInt) throws DBException {
        return null;

    }

    @Override
    public Carport commitCarport(Carport carport) {
        return null;
    }

}
