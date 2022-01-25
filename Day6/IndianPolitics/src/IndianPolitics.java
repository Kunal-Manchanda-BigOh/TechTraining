
public class IndianPolitics {
	public static void main(String[] args) {
		MP mp = new MP("Harsh Vardhan", "Chandni Chowk",
						Constants.SPENDING_LIMIT_MP, 50000, new Vehicle("BMW", "Car", new Driver("Rajiv")),
						false, false);
		
		Minister minister = new Minister("Kejriwal", "Delhi",
				Constants.SPENDING_LIMIT_MINISTER, 58000000, new Vehicle("Audi", "Car", new Driver("Rajiv")));
		
		PM pm = new PM("Narendra Modi", "India",
				Constants.SPENDING_LIMIT_PM, 2000000, new Vehicle("Volvo", "Car", new Driver("Rajiv")),
				new Vehicle("Boeing", "Aircraft", new Driver("Jaiyan")));
		
		pm.setPermissionToArrestMinister(minister, true);
		
		Commisioner commisioner = new Commisioner("Kabir Sharma");
		
		System.out.println("MP Arrest:" + commisioner.canArrest(mp));
		System.out.println("Minister Arrest:" + commisioner.canArrest(minister));
		System.out.println("PM Arrest:" + commisioner.canArrest(pm));
	}
}
