package domain.items;

public class Seller {
    int sellerID;
    int name;

    public Seller(int sellerID, int name) {
        this.sellerID = sellerID;
        this.name = name;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
