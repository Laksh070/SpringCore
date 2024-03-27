package com.lifecycle;

import java.beans.Beans;

public class Bean {
    private double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        System.out.println("Setting price");
        this.price = price;
    }

    public Bean(){
        super();
    }

    @Override
    public String toString(){
        return "Bean [price =" + price + "]";
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
