import java.util.*;

public class Whatsapp {
	public static void main(String[] args) {
		User kunal = new User("Kunal", "9643986369");
		
		User kartik = new User("Kartik", "9910257720");
		Status kartikStatusOne = new TextStatus("Happy Republic day", new Date());
		kartik.postStatus(kartikStatusOne);

		User rahul = new User("Rahul", "1235456788");
		Status rahulStatusOne = new TextStatus("Happy Holiday", new Date());
		rahul.postStatus(rahulStatusOne);
		Status rahulStatusTwo = new ImageStatus("Happy Republic Day", new Date(), 15, "png");
		rahul.postStatus(rahulStatusTwo);
		
		kunal.addContact(kartik);
		kunal.addContact(rahul);
		
		Status kunalStatusOne = new TextStatus("Happy sunday!", new Date());
		kunal.postStatus(kunalStatusOne);
		
		kunal.chatWithContact(kartik, new TextMessage("Hi, how are you?", new Date()));
		kunal.chatWithContact(rahul, new TextMessage("Happy Republic Day, Rahul!", new Date()));
		
		kunal.viewStatus(rahul, rahulStatusTwo);
		
		ArrayList<User> kunalContacts = kunal.getContacts();
		
		ArrayList<Message> messages = kunal.getMessages();
		
		ArrayList<Status> statuses = kunal.getStatuses();
		
	}
}
