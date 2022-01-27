import java.util.Date;

public class GIFMessage extends Message {
	
	private String sizeInKB;
	
	public GIFMessage(String content, Date dateAndTime, String sizeInKB) { //Constructor
		super(content, "gif", dateAndTime);
		this.sizeInKB = sizeInKB;
	}

}
