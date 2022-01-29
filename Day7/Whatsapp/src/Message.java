import java.util.*;

public class Message {
	private String content; //To hold the content of message
	private Date dateAndTime; //To hold the date and time of message
	private String type; //To hold the type of message(Text, audio and video)
	private boolean seen; //To determine whether the message has been seen or not
	private boolean delivered; //To determine whether the message has been delivered or not
	
	Message(String content, String type, Date dateAndTime){  //Constructor
		this.content = content;
		this.type = type;
		this.dateAndTime = dateAndTime;
		this.delivered = true;
		this.seen = false;
	}

	public String getContent() { //To get the content of message
		return content;
	}
	
	public Date getDateAndTime() { //To get date and time of message
		return dateAndTime;
	}

	public String getType() { //To get the type of message
		return type;
	}
	
	public void seeMessage() {
		this.seen = true;
	}

}
