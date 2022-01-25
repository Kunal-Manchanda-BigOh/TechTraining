
public class Vehicle {
	private String name;
	private String type;
	private Driver driver;
	
	Vehicle(String name, String type, Driver driver){
		this.name = name;
		this.type = type;
		this.driver = driver;
	}
	
	public String getDriverName() {
		return driver.getName();
	}
	
	public String getVehicleType() {
		return type;
	}
}
