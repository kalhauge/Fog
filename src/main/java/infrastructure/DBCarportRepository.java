package infrastructure;

import domain.items.Carport;
import domain.items.CarportRepository;
import domain.items.Shed;

public class DBCarportRepository implements CarportRepository {
    @Override
    public Iterable<Carport> findAll() {
        return null;
    }

    @Override
    public Carport find(int parseInt) {
        Carport carport=new Carport("",parseInt,5000,9000,new Shed(1,"",4000,2500));
        return carport;
    }
}
