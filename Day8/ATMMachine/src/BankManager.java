import java.util.*;

public class BankManager {
	private String name; //To hold the name of the bank manager
	private String mobileNumber; //To hold the mobile number of bank manager
	private String email; //To hold the email of bank manager
	private Bank bank; //To hold the bank to which the bank manager belongs
	
	BankManager(String name, String mobileNumber, String email, Bank bank){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.bank = bank;
	}
	
	public void topUpCashInATM(Map<Integer, Integer> denominations, ATM atm) { //To add cash to ATM
		atm.topUp(denominations);
	}
}
