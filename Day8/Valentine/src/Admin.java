import java.util.*;

public class Admin {
	private String name; //To hold the name of admin
	
	Admin(String name){ //Constructor
		this.name = name;
	}
	
	
	/*
	 * Admin can edit any brick
	 */
	public void editBrickCaption(Brick brick, String newCaption) {
		brick.editCaption(newCaption);
	}
	
	public void editBrickMessage(Brick brick, String newMessage) {
		brick.editMessage(newMessage);
	}
	
	public void editBrickDedicatedUser(Brick brick, User newDedicatedUser) {
		brick.editDedicatedUser(newDedicatedUser);
	}
}
