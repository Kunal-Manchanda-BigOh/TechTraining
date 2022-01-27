
public class SolarInverter extends Inverter implements SolarEnergy {
	
	private SolarPanel solarPanel;
	
	SolarInverter(String name, double current, double voltage, Battery battery, boolean gridOn, SolarPanel solarPanel){
		super(name, "Solar Inverter", current, voltage, battery, gridOn);
		this.solarPanel = solarPanel;
	}
	
	public void displaySolarEnergyInfo() {
		System.out.println("Hour Angle:" + hourAngle);
		System.out.println("Angle of Declination:" + angleOfDeclination);
		System.out.println("Solar Constant:" + solarConstant);
	}
	
}
