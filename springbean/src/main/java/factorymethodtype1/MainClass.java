package factorymethodtype1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("factorymethodtype1/applicationContext.xml");
		A a=(A)context.getBean("a");
		a.msg();
		}

}
