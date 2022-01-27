import java.util.*;

public class TextMessage extends Message {
	
	TextMessage(String content, Date dateAndTime){ //Constructor
		super(content, "text", dateAndTime);
	}
	
}
