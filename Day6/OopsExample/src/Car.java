
public class Car implements Vehicle {
	private String name;
	private String color= "";
	Car(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	Car(String name){
		this.name = name;
	}
	
	public void display() {
		System.out.println("Car:" + color + " " + name);
	}
	
	public void start() {
		System.out.println("Car Start");
	}
	
	public void stop() {
		System.out.println("Car Stop");
	}
	
}
