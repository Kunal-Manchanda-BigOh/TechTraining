
public class IOTInverterCompany {
	public static void main(String[] args) {
		
		double pciCurrent = 1.7;
		double pciVoltage = 15.2;
		PCU pci = new PCU(pciCurrent, pciVoltage, new Battery("Li-on", "12-A", 1.8, 18.3, true), new SolarPanel("PP-30", "3%", 1.7, 18)); //Object of PCU
		display(pci);
		
		double gtiCurrent = 1.8;
		double gtiVoltage = 14.12;
		GTI gti = new GTI(gtiCurrent, gtiVoltage, new Battery("Li-on", "12-A", 1.8, 18.3, true), new SolarPanel("PP-31", "4%", 1.7, 18)); //Object of GTI
		display(gti);
		
		double zelioCurrent = 1.4;
		double zelioVoltage = 13.21;
		Zelio zelio = new Zelio(zelioCurrent, zelioVoltage, new Battery("Li-on", "12-A", 1.8, 18.3, false)); //Object of Zelio
		display(zelio);
		
		double regaliaCurrent = 1.5;
		double regaliaVoltage = 11.21;
		Regalia regalia = new Regalia(regaliaCurrent, regaliaVoltage, new Battery("Li-on", "12-A", 1.8, 18.3, true), new SolarPanel("PP-32", "5%", 1.7, 18)); //Object of Regalia
		display(regalia);
		
		double icruzeCurrent = 2.0;
		double icruzeVoltage = 17.1;
		ICruze icruze = new ICruze(icruzeCurrent, icruzeVoltage, new Battery("Li-on", "12-A", 1.8, 18.3, false)); //Object of iCruze
		display(icruze);
	}
	
	public static void display(Inverter inverter) { //To display the information of inverter

		System.out.println("Name:" + inverter.getName());
		System.out.println("Type:" + inverter.getType());
		System.out.println("Current:" + inverter.getCurrent());
		System.out.println("Voltage:" + inverter.getVoltage());
		System.out.println("Power Rating:" + inverter.getPowerRating());
		System.out.println("Battery:" + inverter.getBattery());
		System.out.println("Grid On:" + inverter.getGridOn());
		System.out.println();
	}
}
