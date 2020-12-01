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
        if (parseInt==1) return new Carport("",1,5000,7000,0);
        if (parseInt==2) return new Carport("",2,4500,7500,0);
        if (parseInt==3) return new Carport("",3,5000,7000,1);
        if (parseInt==4) return new Carport("",3,5000,7000,0);

        return null;

    }
}
