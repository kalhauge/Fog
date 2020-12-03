package domain.items;

import java.time.LocalDate;

public class Order {
    int orderID;
    LocalDate tilbudsdato;
    LocalDate ordredato;
    LocalDate leveringsDato;
    String kundeNavn;
    int saelgerId;
    int carportId;
    int price;
    String status;

    public Order(LocalDate tilbudsdato, LocalDate ordredato, LocalDate leveringsDato,String kundeNavn, int saelgerId, int carportId, int price, String status) {
        this.tilbudsdato = tilbudsdato;
        this.ordredato = ordredato;
        this.leveringsDato = leveringsDato;
       this.kundeNavn=kundeNavn;
        this.saelgerId = saelgerId;
        this.carportId = carportId;
        this.price = price;
        this.status = status;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public Order(int orderID, int kundeid, int carportId, int price, String status) {
        this.orderID = orderID;
        this.carportId = carportId;
        this.price = price;
        this.status = status;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setTilbudsdato(LocalDate tilbudsdato) {
        this.tilbudsdato = tilbudsdato;
    }

    public void setOrdredato(LocalDate ordredato) {
        this.ordredato = ordredato;
    }

    public void setLeveringsDato(LocalDate leveringsDato) {
        this.leveringsDato = leveringsDato;
    }


    public void setSaelgerId(int saelgerId) {
        this.saelgerId = saelgerId;
    }

    public void setCarportId(int carportId) {
        this.carportId = carportId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getTilbudsdato() {
        return tilbudsdato;
    }

    public LocalDate getOrdredato() {
        return ordredato;
    }

    public LocalDate getLeveringsDato() {
        return leveringsDato;
    }



    public int getSaelgerId() {
        return saelgerId;
    }

    public int getCarportId() {
        return carportId;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
