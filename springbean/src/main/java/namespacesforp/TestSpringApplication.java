package namespacesforp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factorymethodtype3.Printable;

public class TestSpringApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("namespacesforp/bean.xml");
	Employee emp = (Employee) context.getBean("emp");
	System.out.println(emp);
	}


}
