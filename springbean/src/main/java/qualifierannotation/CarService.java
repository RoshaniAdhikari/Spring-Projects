package qualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class CarService{
        @Autowired
        @Qualifier("audi")
        Car car;
          public Car getCar() {
                return car;
        }
         public void setCar(Car car) {
                this.car = car;

        }
       

}