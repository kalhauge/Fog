package domain.items;

public class Carport {
    String type;
    int carportID;
    int width;
    int lenght;
    Shed shed;



    public Carport(String type, int carportID, int width, int lenght, Shed shed) {
        this.type = type;
        this.carportID = carportID;
        this.width = width;
        this.lenght = lenght;
        this.shed = shed;
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

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return this.lenght;
    }

    public Shed getShed() {
        return shed;
    }

    public void setCarportID(int carportID) {
        this.carportID = carportID;
    }
}