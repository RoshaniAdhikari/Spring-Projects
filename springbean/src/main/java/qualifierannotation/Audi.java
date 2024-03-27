package qualifierannotation;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
@Qualifier("audi")
public class Audi implements Car{
    public void printCarName() {
                System.out.println("Audi");
        }
}