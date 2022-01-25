
public class SolarInverter extends Inverter implements SolarPanel, SolarEnergy {
	
	SolarInverter(String name, double current, double voltage, boolean hasBattery, boolean gridOn){
		super(name, "Solar Inverter", current, voltage, hasBattery, gridOn);
	}
	
	public void displaySolarPanelInfo() {
		System.out.println("Model Number:" + modelNumber);
		System.out.println("Output Tolerance:" + outputTolerance);
		System.out.println("Max Current:" + maxCurrent);
		System.out.println("Max Voltage:" + maxVoltage);
	}
	
	public void displaySolarEnergyInfo() {
		System.out.println("Hour Angle:" + hourAngle);
		System.out.println("Angle of Declination:" + angleOfDeclination);
		System.out.println("Solar Constant:" + solarConstant);
	}
	
}
