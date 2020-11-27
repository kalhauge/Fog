package domain.items;

public class Shed {
    int shedID;
    String type;
    int lenght;
    int widht;

    public Shed(int shedID, String type, int width, int lenght) {
        this.shedID = shedID;
        this.type = type;
        this.lenght = lenght;
        this.widht = width;
    }


    public int getShedID() {
        return shedID;
    }

    public void setShedID(int shedID) {
        this.shedID = shedID;
    }

    public String getType() {
        return type;
    }


    public int getLenght() {
        return lenght;
    }

    public int getWidht() {
        return widht;
    }

    public void setType(String type) {
        this.type = type;
    }
}
