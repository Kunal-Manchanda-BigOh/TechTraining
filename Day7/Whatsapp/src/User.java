import java.util.*;

public class User {
	
	private String name; //To hold the name of the user
	private String mobileNumber; //To hold the mobile number of the user
	private String about; //To hold the info about user
	private ArrayList<Contact> contacts; //To hold the list of contacts of the user
	private ArrayList<Status> statuses; //To hold the statuses of the user
	private HashMap<String, ArrayList<Status>> contactStatuses; //To hold the map of contact statuses in the form {mobile number of contact: list of status}
	private HashMap<String, ArrayList<Message>> messages; //To hold the map of messages of the user in the form {mobile number of contact: list of messages}

	User(String name, String mobileNumber){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.about = "Hi, there i am using whatsapp";
		this.contacts = new ArrayList<>();
		this.statuses = new ArrayList<>();
		this.contactStatuses = new HashMap<String, ArrayList<Status>>();
		this.messages = new HashMap<String, ArrayList<Message>>();
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

	public ArrayList<Contact> getContacts() { //To get the list of contacts of the user
		return contacts;
	}

	public ArrayList<Status> getStatuses() { //To get the list of statuses
		return statuses;
	}
	
	public HashMap<String, ArrayList<Status>> getContactStatuses(){ //To get the statuses of the contacts
		return contactStatuses;
	}
	
	public HashMap<String, ArrayList<Message>> getMessages(){ //To get all messages of user
		return messages;
	}
	
	public void setAbout(String value) { //To set the info about user
		this.about = value;
	}
	
	public void addContact(Contact contact) { //To add contact
		contacts.add(contact);
		contactStatuses.put(contact.getMobileNumber(), contact.getStatuses());
	}
	
	public void postStatus(Status status){ //To post a status
		statuses.add(status);
	}
	
	public void chatWithContact(Contact contact, Message message) { //To chat with particular contact
		ArrayList<Message> previousMessagesWithContact = messages.get(contact.getMobileNumber());
		previousMessagesWithContact.add(message);
		messages.put(contact.getMobileNumber(), previousMessagesWithContact);
	}
	
	public void viewStatus(Status status) { //To view status of particular contact
		List<Status> statusList = contactStatuses.get(status.getUploadedBy());
		Status currentStatus = statusList.get(statusList.indexOf(status));
		currentStatus.setViewedBy(this);
	}
	
	public void readMessage(Message message) {
		message.seeMessage();
	}
}
