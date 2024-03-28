package com.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

    private List<String> friends;
    private Map<String, Integer> feestructure;
    private Properties prop;
    public List<String> getFriends() {
        return friends;
    }

    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public Properties getProp() {
        return prop;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends= " + friends +
                "\nFeestructure= " + feestructure +
                '}';
    }
}
