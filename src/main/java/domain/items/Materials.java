package domain.items;

public class Materials {
    String name;
    float length;
    float width;
    int pricePrPiece;

    public Materials(String name, float length, float width, int pricePrPiece) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.pricePrPiece = pricePrPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getPricePrPiece() {
        return pricePrPiece;
    }

    public void setPricePrPiece(int pricePrPiece) {
        this.pricePrPiece = pricePrPiece;
    }
}
