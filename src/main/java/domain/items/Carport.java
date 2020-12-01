package domain.items;

public class Carport {

    int carportID;
    int width;
    int lenght;

    String tag;
    boolean rejsning;
    int shedWidth;
    int shedLength;

    public Carport(int width, int lenght, String tag, boolean rejsning , int shedWidth, int shedLength) {

        this.width = width;
        this.lenght = lenght;
        this.tag = tag;
        this.rejsning = rejsning;
        this.shedWidth = shedWidth;
        this.shedLength = shedLength;

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

    public String getTag() {
        return tag;
    }

    public boolean getRejsning() {
        return rejsning;
    }

    public int getShedWidth() {
        return shedWidth;
    }

    public int getShedLength() {
        return shedLength;

    }

    public void setCarportID(int carportID) {
        this.carportID = carportID;
    }
}
