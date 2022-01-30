import java.util.*;

public class Brick {
	private User ownedBy; //To hold the user who owns the brick
	private String caption; //To hold the caption painted on the brick
	private String message; //To hold the message painted on the brick
	private User dedicatedUser; //To hold the user to whom the brick is dedicated
	private HashMap<String, String> comments; //To hold the comments of the user
	private boolean isPainted; //To hold whether the brick is painted or not
	
	Brick(User ownedBy){ //Constructor
		this.ownedBy = ownedBy;
		this.caption = "";
		this.message = "";
		this.dedicatedUser = null;
		this.comments = new HashMap<String, String>();
		this.isPainted = false;
	}
	
	public void paint(String caption, String message, User dedicatedUser) { //To paint the brick
		this.caption = caption;
		this.message = message;
		this.dedicatedUser = dedicatedUser;
		this.isPainted = true;
		
		dedicatedUser.addDedicatedBrick(this); //Adding brick to dedicated user's dedicated bricks
	}
	
	public HashMap<String, String> readContent() { //To get the content of the brick
		HashMap<String, String> content = new HashMap<String, String>();
		content.put("Caption", caption);
		content.put("Message", message);
		content.put("DedicatedTo", dedicatedUser.getName());
		return content;
	}
	
	public void commentBrick(String name, String comment) { //To comment on the brick
		comments.put(name, comment);
	}
	
	public boolean getIsPainted() { //To get whether the brick is painted or not
		return this.isPainted;
	}
	
	public void editCaption(String newCaption) { //To edit the caption of brick
		this.caption = newCaption;
	}
	
	public void editMessage(String newMessage) { //To edit the message of brick
		this.message = newMessage;
	}
	
	public void editDedicatedUser(User newDedicatedUser) { //To edit the dedicated user of the brick
		if(this.dedicatedUser != newDedicatedUser) {
			this.dedicatedUser.removeDedicatedBrick(this);
			this.dedicatedUser = newDedicatedUser;
		}
	}
}
