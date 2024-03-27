package requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factorymethodtype1.A;

public class mainClass {
	public static void main(String[] args) {
		//for @annotation required 5.0.0 RELEASE version
		ApplicationContext context=new ClassPathXmlApplicationContext("requiredannotation/bean.xml");
		Student student=(Student)context.getBean("student");
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());

		}

}
