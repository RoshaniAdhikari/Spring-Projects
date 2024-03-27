package dependencyinjection;

public class Employee1 {
	private int id;
	private String name;
	
	public Employee1() {
		System.out.println("Default Constructor");
	}
	
	public Employee1(int id) {
		this.id = id;
	}
	
	public Employee1(String name) {
		this.name = name;
	}

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void show() {
		System.out.println(id+" "+name);
	}

}
