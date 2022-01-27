import java.util.*;

public class Contact {
	private String name; //To hold the name of the user's contact
	private String mobileNumber; //To hold the mobile number of user's contact
	private ArrayList<Status> statuses; //To hold all the statuses of user's contact
	
	Contact(String name, String mobileNumber) { //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.statuses = new ArrayList<>();
	}

	public String getName() { //To get the name of user's contact
		return name;
	}

	public String getMobileNumber() { //To get the mobile number of user's contact
		return mobileNumber;
	}
	
	public ArrayList<Status> getStatuses(){ //To get all the statuses of user's contact
		return statuses;
	}
	
	public void addStatus(Status status) {
		statuses.add(status);
	}
	
	public void statusViewed(User user, Status status) { //To tell the contact that the user has viewed his status
		status.setViewedBy(user);
	}
	
}
