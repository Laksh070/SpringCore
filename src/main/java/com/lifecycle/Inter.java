package com.lifecycle;

// initializing bean lifecycle using interface

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Inter implements InitializingBean, DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Inter(){
        super();
    }

    @Override
    public String toString() {
        return "Inter{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("drinking pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("throwing bottle: destroy");
    }
}
