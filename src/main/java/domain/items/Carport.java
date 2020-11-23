package domain.items;

public class Carport {
    String type;
    int carportID;

    public Carport(String type, int carportID) {
        this.type = type;
        this.carportID = carportID;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getCarportID() {
        return carportID;
    }

    public void setCarportID(int carportID) {
        this.carportID = carportID;
    }
}
