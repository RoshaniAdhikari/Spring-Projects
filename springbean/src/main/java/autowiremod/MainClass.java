package autowiremod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiremod/applicationContext.xml");
		A a=context.getBean("a",A.class);
		a.display();
	}

}