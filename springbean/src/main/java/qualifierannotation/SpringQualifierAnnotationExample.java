package qualifierannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "qualifierannotation" })
public class SpringQualifierAnnotationExample {
        public static void main(String[] args) {
         AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
         SpringQualifierAnnotationExample.class);
              CarService carService = (CarService)ctx.getBean("carService");
                carService.getCar().printCarName();
        }
}

     