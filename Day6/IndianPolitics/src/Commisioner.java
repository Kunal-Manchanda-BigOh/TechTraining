
public class Commisioner extends Person {
	
	Commisioner(String name){ //Constructor
		super(name);
	}
	
	public boolean canArrest(MP mp) { //To arrest MP, Minister or PM
		if(mp.exceedsSpendingLimit()) { //If the he exceeds spending limit, then he can be arrested
			if(mp.getIsPM()) { //If MP is PM
				mp.setIsArrested(false);
				return false;
			}
			else if(mp.getIsMinister()) { //If MP is Minister, then he can be arrested with PM's Permission
				if(mp.getPermissionToBeArrested()) { //PM grants permission to arrest the Minister
					mp.setIsArrested(true);
					return true;
				}
				else { //PM does not grants permission to arrest the Minister
					mp.setIsArrested(false);
					return false;
				}
			}
			else { //If he is MP
				mp.setIsArrested(true);
				return true;
			}
		}
		else { //If he does not exceeds spending Limit
			mp.setIsArrested(false);
			return false;
		}
	}
}
