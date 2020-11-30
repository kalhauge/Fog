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
       if(parseInt!=0)return new Shed(parseInt,"",3000,2500);
        return null;
    }
}
