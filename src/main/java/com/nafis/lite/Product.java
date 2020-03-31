package com.nafis.lite;

import java.util.Date;
import java.util.Objects;

public class Product {
    private String title;
    private String manufacturer;
    private double price;
    private String dateOfManufacture;
    private String expiration;

    public Product(String title, String manufacturer, double price, String dateOfManufacture, String expiration) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.expiration = expiration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
