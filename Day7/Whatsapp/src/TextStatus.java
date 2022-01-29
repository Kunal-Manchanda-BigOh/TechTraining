import java.util.*;

public class TextStatus extends Status {
	
	TextStatus(String content, Date dateAndTime, String uploadedBy){ //Constructor
		super(content, "text", dateAndTime, uploadedBy);
	}
}
