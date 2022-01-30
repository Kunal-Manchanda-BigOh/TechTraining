import java.util.*;

public class User {
	private String name; //To hold the name of the user
	private String mobileNumber; //To hold the mobile number of the user
	private String email; //To hold the email of the user
	private Account account; //To hold the account of the user
	
	User(String name, String mobileNumber, String email, Account account){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.account = account;
	}

	public String getName() { //To get the name of user
		return name;
	}

	public String getMobileNumber() { //To get the mobile number of user
		return mobileNumber;
	}

	public String getEmail() { //To get the email of user
		return email;
	}

	public Account getAccount() { //To get the account of user
		return account;
	}
	
	public Map<Integer, Integer> withdrawCash(long amount, ATM atm){ //To withdraw cash from ATM
		return atm.withdrawCash(amount, account);
	}
}
