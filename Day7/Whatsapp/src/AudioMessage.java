import java.util.Date;

public class AudioMessage extends Message {
	
	private float maxFileSizeInMB = Constants.MESSAGE_MAX_FILE_SIZE_IN_MB; //To hold the max size of mp3 file
	private float maxFileLengthInMinutes = Constants.MESSAGE_MAX_LENGTH_IN_MINUTES; //To hold the max length of mp3 file
	private float fileSizeInMB; //To hold the file size
	private float fileLengthInMinutes; //To hold the file length
	public AudioMessage(String content, Date dateAndTime, float fileSizeInMB, float fileLengthInMinutes) { //Constructor
		super(content, "audio", dateAndTime);
		this.fileSizeInMB = fileSizeInMB;
		this.fileLengthInMinutes = fileLengthInMinutes;
	}
	
}
