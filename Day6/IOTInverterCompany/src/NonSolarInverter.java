
public class NonSolarInverter extends Inverter {
	
	NonSolarInverter(String name, double current, double voltage, Battery battery){
		super(name, "Non Solar Inverter", current, voltage, battery, false);
	}

}
