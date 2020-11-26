package domain.materials;

public class volumeMaterial extends Material {
        int width;
        int heigth;

    public volumeMaterial(int number, String name, int unitPrice) {
        super(number, name, unitPrice);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
