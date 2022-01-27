import java.util.*;

public class Status {
	private String content; //To hold the content of status
	private String type; //To hold the type of status(text and image)
	private ArrayList<User> viewedBy; //To hold the user who has viewed the status
	private Date dateAndTime; //To hold the date and time when the status is uploaded
	
	Status(String content, String type, Date dateAndTime){ //Constructor
		this.content = content;
		this.type = type;
		this.dateAndTime = dateAndTime;
		this.viewedBy = new ArrayList<>();
	}
	
	public String getContent() { //To get the content of status
		return content;
	}
	
	public String getType() { //To get the type of status
		return type;
	}
	
	public Date getDateAndTime() { //To get the date and time of status
		return dateAndTime;
	}
	
	public ArrayList<User> getViewedBy() { //To get the users who viewed the status
		return viewedBy;
	}
	
	public void setViewedBy(User user) { //To set the view of status
		viewedBy.add(user);
	}
}
