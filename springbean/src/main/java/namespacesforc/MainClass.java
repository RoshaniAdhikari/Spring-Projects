package namespacesforc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("namespacesforc/bean.xml");
	Employee emp = (Employee) context.getBean("emp");
	System.out.println(emp);
	}

}
