package container;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClassFoAppContainer {
public static void main(String[] args) {
	ApplicationContext context=new FileSystemXmlApplicationContext("C:/Users/Admin/eclipse-workspace/springbean/src/main/java/container/bean.xml");
	ApplicationContextContainer acc=(ApplicationContextContainer)context.getBean("helloWorld");
	acc.getMessage();
}
}
