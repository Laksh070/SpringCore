package auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfigAnnotations.xml");
        Employee emp = (Employee) context.getBean("emp1");
        System.out.println(emp);
    }
}
