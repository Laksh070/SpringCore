package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanconfig.xml");
        Bean b = (Bean) context.getBean("s1");
        System.out.println(b);
        context.registerShutdownHook();

        System.out.println("++++.........++++\n");
        Inter i1 = (Inter) context.getBean("s2");
        System.out.println(i1);

        Annotatin example = (Annotatin) context.getBean("s3");
        System.out.println(example);
    }
}
