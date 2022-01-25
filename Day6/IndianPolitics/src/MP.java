
public class MP extends Person { // MP is a person who won from a constituency 
	
	private String constituency;
	private int spendingLimit;
	private int currentSpendings;
	private Vehicle vehicle;
	private boolean isArrested;
	private boolean isPM;
	private boolean isMinister;
	private boolean hasPermissionToBeArrested = false; //It states whether the PM has granted permission to arrest him
	
	MP(String name, String constituency, int spendingLimit, int currentSpendings, Vehicle vehicle, boolean isPM, boolean isMinister){ //Constructor
		super(name);
		this.constituency = constituency;
		this.spendingLimit = spendingLimit;
		this.currentSpendings = currentSpendings;
		this.vehicle = vehicle;
		this.isPM = isPM;
		this.isMinister = isMinister;
	}
	
	public int getSpendingLimit() {
		return spendingLimit;
	}
	
	public int getCurrentSpendings() {
		return currentSpendings;
	}
	
	public String getConstituency() { //return their winning constituency
		return constituency;
	}
	
	public String getDriver() { //returns the driver assigned for their vehicle (default car)
		return vehicle.getDriverName();
	}
	
	public boolean exceedsSpendingLimit() { //returns true or false if MPs exceeds to their spending limit
		return currentSpendings > spendingLimit;
	}
	
	public void setIsArrested(boolean value) {
		isArrested = value;
	}
	
	public boolean isArrested() {
		return isArrested;
	}
	
	public boolean getIsPM() {
		return isPM;
	}
	
	public boolean getIsMinister() {
		return isMinister;
	}
	
	public boolean getPermissionToBeArrested() {
		return hasPermissionToBeArrested;
	}
	
	public void setPermissionToBeArrested(boolean value) {
		this.hasPermissionToBeArrested = value;
	}
	
}
