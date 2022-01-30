
public class Account {
	private String type; //To hold the type of account (Saving or Current)
	private String accountNumber; //To hold the account number
	private Bank bank; //To hold the bank
	private long availableBalance; //To hold the current balance
	
	Account(String type, String accountNumber, Bank bank, long availableBalance){ //Constructor
		this.type = type;
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.availableBalance = availableBalance;
	}
	
	public String getType() { //To get the type of account
		return type;
	}
	
	public String getAccountNumber() { //To get the account number
		return accountNumber;
	}
	
	public Bank getBank() { //To get the bank
		return bank;
	}
	
	public long getAvailableBalance() { //To get the available balance
		return availableBalance;
	}
	
	public void credit(long amount) { //To credit with given amount
		this.availableBalance = this.availableBalance + amount;
	}
	
	public void debit(long amount) { //To debit with given amount
		this.availableBalance = this.availableBalance - amount;
	}
}
