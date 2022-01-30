import java.util.*;

public class ATM {
	private long totalBalance; //To hold the total balance in ATM
	private Bank bank; //To hold the bank to which the ATM belongs
	private Map<Integer, Integer> availableDenominations; //To hold the available denominations in the ATM
	
	ATM(Bank bank){ //Constructor
		this.totalBalance = 0;
		this.bank = bank;
		this.availableDenominations = new HashMap<Integer, Integer>(){{
			put(Constants.DENOMINATION_FIRST, 0);
			put(Constants.DENOMINATION_SECOND, 0);
			put(Constants.DENOMINATION_THIRD, 0);
			put(Constants.DENOMINATION_FOURTH, 0);
		}};
	}

	
	public long getTotalBalance() { //To get the total balance available in the ATM
		return totalBalance;
	}


	public Bank getBank() { //To get the bank to which the ATM belongs
		return bank;
	}


	public Map<Integer, Integer> getAvailableDenominations() { //To get the total available denominations
		return availableDenominations;
	}


	public void topUp(Map<Integer, Integer> topedUpDenominations) { //To add cash to ATM (which can only be done by bank manager)
		int firstDenominations = topedUpDenominations.get(Constants.DENOMINATION_FIRST); //To get the toped up first denominations(100 notes)
		int secondDenominations = topedUpDenominations.get(Constants.DENOMINATION_SECOND); //To get the toped up second denominations(200 notes)
		int thirdDenominations = topedUpDenominations.get(Constants.DENOMINATION_THIRD); //To get the toped up third denominations(500 notes)
		int fourthDenominations = topedUpDenominations.get(Constants.DENOMINATION_FOURTH); //To get the toped up fourth denominations(2000 notes)
		
		long totalTopedUpAmount = (firstDenominations*Constants.DENOMINATION_FIRST) + (secondDenominations*Constants.DENOMINATION_SECOND)+
									(thirdDenominations*Constants.DENOMINATION_THIRD) + (fourthDenominations*Constants.DENOMINATION_FOURTH); //Getting the total toped up amount
		
		this.totalBalance = this.totalBalance + totalTopedUpAmount; //Updating ATM balance
		
		
		/*
		 * Updating ATM denominations
		 */
		updateDenomination(Constants.DENOMINATION_FIRST, firstDenominations);
		updateDenomination(Constants.DENOMINATION_SECOND, secondDenominations);
		updateDenomination(Constants.DENOMINATION_THIRD, thirdDenominations);
		updateDenomination(Constants.DENOMINATION_FOURTH, fourthDenominations);
	}
	
	public Map<Integer, Integer> withdrawCash(long amount, Account account) { //To withdraw cash from ATM
		if(account.getAvailableBalance() < amount) { //If the user has insufficient balance in his/her account
			System.out.println("Your account has insufficient balance");
			return null;
		}
		else if(this.totalBalance < amount) { //If the ATM has insufficient balance
			System.out.println("The ATM has insufficient balance");
			return null;
		}
		
		Map<Integer, Integer> previousATMDenominations = this.getAvailableDenominations();
		
		//To hold the denominations which will be withdrawn from the ATM
		Map<Integer, Integer> requiredDenominations = new HashMap<Integer, Integer>();
		requiredDenominations.put(Constants.DENOMINATION_FIRST, 0);
		requiredDenominations.put(Constants.DENOMINATION_SECOND, 0);
		requiredDenominations.put(Constants.DENOMINATION_THIRD, 0);
		requiredDenominations.put(Constants.DENOMINATION_FOURTH, 0);
		
		long remainingAmount = amount;
		
		int fourthDenominations = (int) (remainingAmount / Constants.DENOMINATION_FOURTH);
		if(this.availableDenominations.get(Constants.DENOMINATION_FOURTH) < fourthDenominations) {
			fourthDenominations = this.availableDenominations.get(Constants.DENOMINATION_FOURTH);
		}
		requiredDenominations.put(Constants.DENOMINATION_FOURTH, fourthDenominations);
		remainingAmount = remainingAmount - (fourthDenominations*Constants.DENOMINATION_FOURTH);
		
		int thirdDenominations = (int) (remainingAmount / Constants.DENOMINATION_THIRD);
		if(this.availableDenominations.get(Constants.DENOMINATION_THIRD) < thirdDenominations) {
			thirdDenominations = this.availableDenominations.get(Constants.DENOMINATION_THIRD);
		}
		requiredDenominations.put(Constants.DENOMINATION_THIRD, thirdDenominations);
		remainingAmount = remainingAmount - (thirdDenominations*Constants.DENOMINATION_THIRD);
		
		int secondDenominations = (int) (remainingAmount / Constants.DENOMINATION_SECOND);
		if(this.availableDenominations.get(Constants.DENOMINATION_SECOND) < secondDenominations) {
			secondDenominations = this.availableDenominations.get(Constants.DENOMINATION_SECOND);
		}
		requiredDenominations.put(Constants.DENOMINATION_SECOND, secondDenominations);
		remainingAmount = remainingAmount - (secondDenominations*Constants.DENOMINATION_SECOND);
		
		int firstDenominations = (int) (remainingAmount / Constants.DENOMINATION_FIRST);
		requiredDenominations.put(Constants.DENOMINATION_FIRST, firstDenominations);
		if(this.availableDenominations.get(Constants.DENOMINATION_FIRST) < firstDenominations) {
			firstDenominations = this.availableDenominations.get(Constants.DENOMINATION_FIRST);
		}
		remainingAmount = remainingAmount - (firstDenominations*Constants.DENOMINATION_FIRST);
		
		if(remainingAmount != 0) {
			System.out.println("The ATM do not have the required denominations");
			return null;
		}
		
		/*
		 * Updating ATM denominations
		 */
		updateDenomination(Constants.DENOMINATION_FIRST, firstDenominations);
		updateDenomination(Constants.DENOMINATION_SECOND, secondDenominations);
		updateDenomination(Constants.DENOMINATION_THIRD, thirdDenominations);
		updateDenomination(Constants.DENOMINATION_FOURTH, fourthDenominations);
		
		account.debit(amount); //debiting amount from the user's account
		
		return requiredDenominations;
	}
	
	public void updateDenomination(int denomination, int numberOfDenominations) { //To update denominations in the ATM
		this.availableDenominations.put(
				denomination, this.availableDenominations.get(denomination) + numberOfDenominations);
	}
}
