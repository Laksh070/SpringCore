package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotatin {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
     public Annotatin(){
        super();
     }

    @Override
    public String toString() {
        return "Annotatin{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
