import java.util.Date;

public class ImageMessage extends Message {
	
	private String format; //To hold the format of image(jpg, png, etc)
	private String sizeInKB; //To hold the size of image in kb
	
	public ImageMessage(String content, Date dateAndTime, String format, String sizeInKB) { //Constructor
		super(content, "image", dateAndTime);
		this.format = format;
		this.sizeInKB = sizeInKB;
	}
}
