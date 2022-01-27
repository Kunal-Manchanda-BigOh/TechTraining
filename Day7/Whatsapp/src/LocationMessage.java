import java.util.Date;

public class LocationMessage extends Message {
	
	private String latitude;
	private String longitude;
	public LocationMessage(String content, Date dateAndTime, String latitude, String longitude) { //Constructor
		super(content, "location", dateAndTime);
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
