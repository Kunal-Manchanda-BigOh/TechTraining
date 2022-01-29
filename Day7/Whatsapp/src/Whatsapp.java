import java.util.*;

public class Whatsapp {
	public static void main(String[] args) {
		User kunal = new User("Kunal", "9643986369");
		
		Contact kartik = new Contact("Kartik", "9910257720", "At gym", new ArrayList<Status>(Arrays.asList(new TextStatus("Happy Republic day", new Date(), "9910257720"))));

		Contact rahul = new Contact("Rahul", "1235456788", "Busy", new ArrayList<Status>(Arrays.asList(new TextStatus("Happy Holiday", new Date(), "1235456788"), new ImageStatus("Happy Republic Day", new Date(), 15, "png", "1235456788"))));
		
		kunal.addContact(kartik);
		kunal.addContact(rahul);
		
		Status kunalStatusOne = new TextStatus("Happy sunday!", new Date(), kunal.getMobileNumber());
		kunal.postStatus(kunalStatusOne);
		
		kunal.chatWithContact(kartik, new TextMessage("Hi, how are you?", new Date()));
		kunal.chatWithContact(rahul, new TextMessage("Happy Republic Day, Rahul!", new Date()));
		
		ArrayList<Contact> kunalContacts = kunal.getContacts();
		
		HashMap<String, ArrayList<Message>> messages = kunal.getMessages();
		
		ArrayList<Status> statuses = kunal.getStatuses();
		
		HashMap<String, ArrayList<Status>> contactStatuses = kunal.getContactStatuses();
		
	}
}
