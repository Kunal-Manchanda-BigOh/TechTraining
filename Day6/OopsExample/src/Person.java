import java.util.*;

public class Person {
	private String name; //To hold the name of the person
	private ArrayList<Car> cars; //To hold the cars owned by the person
	private ArrayList<Bike> bikes; //To hold the bikes owned by the person
	
	Person(String name, ArrayList<Car> cars, ArrayList<Bike> bikes){ //Constructor
		this.name = name;
		this.cars = cars;
		this.bikes = bikes;
	}
	
	public void displayInfo() { //To display all the details of the person
		System.out.println("Name:" + name);
		if(cars != null) {
			for(Car car: cars) {
				car.display();
			}
		}
		if(bikes != null) {
			for(Bike bike: bikes) {
				bike.display();
			}
		}
		System.out.println();
	}
}
