import java.util.*;

public class User {
	
	private String name; //To hold the name of the user
	private String mobileNumber; //To hold the mobile number of the user
	private String about; //To hold the info about user
	private ArrayList<User> contacts; //To hold the list of contacts of the user
	private ArrayList<Status> statuses; //To hold the statuses of the user
	private ArrayList<Status> contactStatuses; //To hold the statuses of contacts
	private ArrayList<Message> messages; //To hold the list of messages of the user

	User(String name, String mobileNumber){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.about = "Hi, there i am using whatsapp";
		this.contacts = new ArrayList<>();
		this.statuses = new ArrayList<>();
		this.contactStatuses = new ArrayList<>();
		this.messages = new ArrayList<>();
		this.contacts = new ArrayList<>();
	}
	
	public String getName() { //To get the name of the user
		return name;
	}

	public String getMobileNumber() { //To get the mobile number of the user
		return mobileNumber;
	}
	
	public String getAbout() { //To get the info about user
		return about;
	}

	public ArrayList<User> getContacts() { //To get the list of contacts of the user
		return contacts;
	}

	public ArrayList<Status> getStatuses() { //To get the list of statuses
		return statuses;
	}
	
	public ArrayList<Status> getContactStatuses(){ //To get the statuses of the contacts
		return contactStatuses;
	}
	
	public ArrayList<Message> getMessages(){ //To get all messages of user
		return messages;
	}
	
	public void setAbout(String value) { //To set the info about user
		this.about = value;
	}
	
	public void addContact(User contact) { //To add contact
		contacts.add(contact);
	}
	
	public void postStatus(Status status){ //To post a status and send it to all the contacts
		status.setUploadedBy(this);
		statuses.add(status);
		ArrayList<User> contacts = this.getContacts();
		for(User contact: contacts) {
			contact.addContactStatus(status);
		}
	}
	
	public void addContactStatus(Status status) { //To add contact status
		this.contactStatuses.add(status);
	}
	
	public void chatWithContact(User contact, Message message) { //To chat with particular contact
		message.setSender(this);
		message.setReceiver(contact);
		messages.add(message);
	}
	
	public void viewStatus(User contact, Status status) { //To view status of particular contact
		Status currentStatus = contact.getStatuses().get(contact.getStatuses().indexOf(status));
		currentStatus.setViewedBy(this);
	}
	
	public void readMessage(Message message) {
		message.seeMessage();
	}
}
