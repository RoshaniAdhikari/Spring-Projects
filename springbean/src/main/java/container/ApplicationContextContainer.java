package container;

public class ApplicationContextContainer {
	private String message;

	public void getMessage() {
       System.out.println("Your Message "+message);	
       }

	public void setMessage(String message) {
		this.message = message;
	}
	

}
