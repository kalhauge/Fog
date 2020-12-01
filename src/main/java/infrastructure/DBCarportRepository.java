package infrastructure;

import domain.items.Carport;
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
        if (parseInt==1) return new Carport(3500,7000,"no",false,0,0);
        if (parseInt==2) return new Carport(4000,8000,"",false,0,0);
        if (parseInt==3) return new Carport(4000,8000,"",true,3700,2000);
        if (parseInt==4) return new Carport(4000,8000,"",true,0,0);

        return null;

    }

    @Override
    public Carport commitCarport(Carport carport) {
        return null;
    }

}
