package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);

        System.out.println(student1);
        System.out.println(student2);
    }
}
