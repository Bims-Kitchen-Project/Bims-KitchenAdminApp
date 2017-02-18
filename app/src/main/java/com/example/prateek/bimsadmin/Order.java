package com.example.prateek.bimsadmin;

/**
 * Created by RajeevPC on 2/18/2017.
 */

public class Order {

    private String address, amount, name, number, mail,coordinates;

    public Order(String address, String name, String amount, String number, String mail, String coordinates) {
        this.address = address;
        this.name = name;
        this.amount = amount;
        this.number = number;
        this.mail = mail;
        this.coordinates = coordinates;
    }

    public Order() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
