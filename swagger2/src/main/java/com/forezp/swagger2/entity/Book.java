package com.forezp.swagger2.entity;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = -7038534296178795070L;

    private long id;
    private String name;
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
