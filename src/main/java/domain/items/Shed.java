package domain.items;

public class Shed {
    int shedID;
    String type;

    public Shed(int shedID, String type) {
        this.shedID = shedID;
        this.type = type;
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

    public void setType(String type) {
        this.type = type;
    }
}
