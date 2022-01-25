
public class Bike implements Vehicle {
	private String name;
	private String color= "";
	Bike(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	Bike(String name){
		this.name = name;
	}
	
	public void display() {
		System.out.println("Bike:" + color + " " + name);
	}
	
	public void start() {
		System.out.println("Bike Start");
	}
	
	public void stop() {
		System.out.println("Bike Stop");
	}
}
