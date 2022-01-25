
public class Inverter {
	
	private double powerRating; //To hold the power rating of inverter
	private double current; //To hold the current of inverter
	private double voltage; //To hold the voltage of inverter
	private boolean hasBattery; //To hold true, if the inverter contains battery otherwise, false
	private String type; //To hold the type of inverter whether Solar or Non Solar
	private String name; //To hold the name of inverter
	private boolean hasGridOn; //To hold true, if the inverter has grid on feature otherwise false
	
	Inverter(String name, String type, double current, double voltage, boolean hasBattery, boolean hasGridOn){ //Constructor
		this.name = name;
		this.type = type;
		this.current = current;
		this.voltage = voltage;
		this.powerRating = current*voltage;
		this.hasBattery = hasBattery;
		this.hasGridOn = hasGridOn;
	}
	
	public double getPowerRating() {
		return powerRating;
	}
	
	public double getCurrent() {
		return current;
	}
	
	public double getVoltage() {
		return voltage;
	}
	
	public boolean getBattery() {
		return hasBattery;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getGridOn() {
		return hasGridOn;
	}
	
}
