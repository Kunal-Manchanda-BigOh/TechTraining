
public interface SolarPanel { //Interface to represent Solar Panel
	public String modelNumber = "PP-30";
	public String outputTolerance = "3%";
	public double maxCurrent = 1.7;
	public double maxVoltage = 18.0;
	
	public void displaySolarPanelInfo();
}
