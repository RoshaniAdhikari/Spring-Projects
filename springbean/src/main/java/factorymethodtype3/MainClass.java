package factorymethodtype3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("factorymethodtype3/applicationContext.xml");
Printable p=(Printable)context.getBean("p");
p.print();
}
}
