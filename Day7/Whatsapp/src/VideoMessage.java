import java.util.Date;

public class VideoMessage extends Message {
	
	private float maxFileSizeInMB = Constants.MESSAGE_MAX_FILE_SIZE_IN_MB; //To hold the max size of mp3 file
	private float maxFileLengthInMinutes = Constants.MESSAGE_MAX_LENGTH_IN_MINUTES; //To hold the max length of mp3 file
	private float fileSizeInMB; //To hold the file size
	private float fileLengthInMinutes; //To hold the file length
	public VideoMessage(String content, Date dateAndTime, float fileSizeInMB, float fileLengthInMinutes) { //Constructor
		super(content, "video", dateAndTime);
		this.fileSizeInMB = fileSizeInMB;
		this.fileLengthInMinutes = fileLengthInMinutes;
	}
	
	
}
