import java.util.*;

public class Contact {
	private String name; //To hold the name of the user's contact
	private String mobileNumber; //To hold the mobile number of user's contact
	private String about; //To hold the about status of contact
	private ArrayList<Status> statuses; //To hold all the statuses of user's contact
	
	Contact(String name, String mobileNumber, String about, ArrayList<Status> statuses) { //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.statuses = statuses;
		this.about = about;
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
	
	public void statusViewed(User user, Status status) { //To tell the contact that the user has viewed his status
		status.setViewedBy(user);
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String value) {
		this.about = value;
	}
	
}
