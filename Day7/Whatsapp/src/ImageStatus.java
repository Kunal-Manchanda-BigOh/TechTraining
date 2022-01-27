import java.util.*;

public class ImageStatus extends Status {
	
	private double sizeInKB; //To hold the size of image
	private String format; //To hold the format of image, eg: jpg, png, etc.
	
	ImageStatus(String content, Date dateAndTime, double sizeInKB, String format){
		super(content, "image", dateAndTime);
		this.sizeInKB = sizeInKB;
		this.format = format;
	}

}
