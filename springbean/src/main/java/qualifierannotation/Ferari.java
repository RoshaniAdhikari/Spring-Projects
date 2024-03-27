package qualifierannotation;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
@Qualifier("ferrari")
public class Ferari implements Car{
        public void printCarName() {
                System.out.println("Ferrari");
        }

}