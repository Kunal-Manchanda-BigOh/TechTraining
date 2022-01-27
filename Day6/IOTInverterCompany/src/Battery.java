
public class Battery {
	private String name;
	private String model;
	private double maxCurrent;
	private double maxVoltage;
	private boolean isChargedBySolarEnergy;
	
	public Battery(String name, String model, double maxCurrent, double maxVoltage, boolean isChargedBySolarEnergy) {
		this.name = name;
		this.model = model;
		this.maxCurrent = maxCurrent;
		this.maxVoltage = maxVoltage;
		this.isChargedBySolarEnergy = isChargedBySolarEnergy;
	}
	
	
}
