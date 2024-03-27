package factorymethodtype3;

public class PrintableFactory {
		//non-static factory method
		public Printable getPrintable(){
		return new B();
//		return new A();//return any one instance, either A or B
		}
	}

