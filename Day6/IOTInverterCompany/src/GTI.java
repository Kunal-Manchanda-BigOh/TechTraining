
public class GTI extends SolarInverter {
	
	GTI(double current, double voltage, Battery battery, SolarPanel solarPanel){
		super("GTI", current, voltage, battery, false, solarPanel);
	}
	
}