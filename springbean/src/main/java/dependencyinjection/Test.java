package dependencyinjection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.*;

import container.ApplicationContextContainer;
public class Test {
		public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("dependencyinjection/applicationContext.xml");
		Employee s=(Employee)context.getBean("e");	
		s.show();
		}


}
