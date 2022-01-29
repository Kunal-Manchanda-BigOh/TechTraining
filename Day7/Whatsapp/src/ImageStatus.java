import java.util.*;

public class ImageStatus extends Status {
	
	private double sizeInKB; //To hold the size of image
	private String format; //To hold the format of image, eg: jpg, png, etc.
	
	ImageStatus(String content, Date dateAndTime, double sizeInKB, String format, String uploadedBy){
		super(content, "image", dateAndTime, uploadedBy);
		this.sizeInKB = sizeInKB;
		this.format = format;
	}

}
