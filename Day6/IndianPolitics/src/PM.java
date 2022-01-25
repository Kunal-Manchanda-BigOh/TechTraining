
public class PM extends MP{
	
	private Vehicle vehicleTwo; //PM enjoys special benefits such as Aircraft
	
	PM(String name, String constituency, int spendingLimit, int currentSpendings, Vehicle vehicleOne, Vehicle vehicleTwo){ //Constructor
		super(name, constituency, spendingLimit, currentSpendings, vehicleOne, true, false);
		this.vehicleTwo = vehicleTwo;
	}
	
	public void setPermissionToArrestMinister(MP mp, boolean value) {
		mp.setPermissionToBeArrested(value);
	}
}
