package setterdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("setterdependencyinjection/bean.xml");
		TextEditor te=(TextEditor) context.getBean("textEditor");
		te.spellCheck();
		
	}

}
