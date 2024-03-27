package dependencyinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForEmp1 {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("dependencyinjection/beanforemp1.xml");
		Employee1 e=context.getBean("e",Employee1.class);
		e.show();
	}
	}