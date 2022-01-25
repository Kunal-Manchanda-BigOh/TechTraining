import java.util.*;

public class OopsExample {
	public static void main(String[] args) {
		Person shiva = new Person("Shiva", null, new ArrayList<Bike>(Arrays.asList(new Bike("Splendor"))));
		Person bhavuk = new Person("Bhavuk", new ArrayList<Car>(Arrays.asList(new Car("Baleno", "red"), new Car("Santro", "black"))), null);
		Person payal = new Person("Payal", new ArrayList<Car>(Arrays.asList( new Car("Swift", "blue"))), null);
		Person tarun = new Person("Tarun", new ArrayList<Car>(Arrays.asList(new Car("BMW"))), null);
		Person updesh = new Person("Updesh", new ArrayList<Car>(Arrays.asList(new Car("BMW"))), new ArrayList<Bike>(Arrays.asList(new Bike("TVS"))));
		
		shiva.displayInfo();
		bhavuk.displayInfo();
		payal.displayInfo();
		tarun.displayInfo();
		updesh.displayInfo();
	}
}
