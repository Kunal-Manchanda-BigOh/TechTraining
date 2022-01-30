
public class Bank {
	private String bankName; //To hold the bank name
	private String area; //To hold the area to which the bank belongs
	private String ifscCode; //To hold the IFSC code of the bank
	
	Bank(String bankName, String area, String ifscCode){ //Constructor
		this.bankName = bankName;
		this.area = area;
		this.ifscCode = ifscCode;
	}

	public String getBankName() { //To get the name of the bank
		return bankName;
	}

	public String getArea() { //To get the area of bank
		return area;
	}

	public String getIfscCode() { //To get the IFSC code of bank
		return ifscCode;
	}
	
	
}
