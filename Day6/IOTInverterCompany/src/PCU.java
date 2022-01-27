
public class PCU extends SolarInverter {
	
	PCU(double current, double voltage, Battery battery, SolarPanel solarPanel){
		super("PCU", current, voltage, battery, false, solarPanel);
	}
	
}
