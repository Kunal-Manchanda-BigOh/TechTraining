import java.util.*;

public class ATMMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank sbi = new Bank("State Bank of India", "Noida", "123456");
		ATM atm = new ATM(sbi);
		BankManager sbiBankManager = new BankManager("Hasan", "9865321459", "hasan@gmail.com", sbi);
		sbiBankManager.topUpCashInATM(new HashMap<Integer, Integer>(){{
			put(Constants.DENOMINATION_FIRST, 10);
			put(Constants.DENOMINATION_SECOND, 10);
			put(Constants.DENOMINATION_THIRD, 10);
			put(Constants.DENOMINATION_FOURTH, 10);
		}}, atm);
		
		System.out.println("ATM Total Balance: " + atm.getTotalBalance());
		System.out.println(atm.getAvailableDenominations());
		System.out.println();
		
		Account kunalAccount = new Account("Savings", "123454779", sbi, 5000);
		User kunal = new User("Kunal", "9643986369", "kunalmanchanda69@gmail.com", kunalAccount);
		displayInfo(kunal);
		
		System.out.println("Enter the amount to withdraw:");
		long amount = sc.nextLong();
		
		Map<Integer, Integer> withdrawnDenominations = kunal.withdrawCash(amount, atm);
		
		if(withdrawnDenominations != null) {
			System.out.println("Withdrawn Denominations:");
			System.out.println(withdrawnDenominations);
		}
		
		displayInfo(kunal);
		
		sc.close();
	}
	
	public static void displayInfo(User user) { //To display the info of user
		System.out.println("Name: " + user.getName());
		System.out.println("Mobile Number: " + user.getMobileNumber());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Account: " + user.getAccount().getType());
		System.out.println("Bank Name: " + user.getAccount().getBank().getBankName());
		System.out.println("Available Balance: " + user.getAccount().getAvailableBalance());
		System.out.println();
	}
}
