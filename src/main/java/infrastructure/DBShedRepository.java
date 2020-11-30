package infrastructure;

import domain.items.Shed;
import domain.items.ShedRepository;

public class DBShedRepository implements ShedRepository {
    @Override
    public Iterable<Shed> findAll() {
        return null;
    }

    @Override
    public Shed find(int parseInt) {
        Shed shed=new Shed(parseInt,"",5000,2500);
        return shed;
    }
}
