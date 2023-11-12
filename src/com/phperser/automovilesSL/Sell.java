package com.phperser.automovilesSL;

import java.util.ArrayList;

public class Sell {

    private String id;
    private String date;
    private String payMetod;
    private String price;
    private Customer customer;
    private Vehicle vehicle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPayMetod() {
        return payMetod;
    }

    public void setPayMetod(String payMetod) {
        this.payMetod = payMetod;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
