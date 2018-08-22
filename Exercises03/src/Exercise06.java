import java.util.Calendar;
import java.util.TimeZone;

/**
 * Is there the same date in New York and Beijing now?
 */

public class Exercise06 {
	private Calendar getNewYorkTime() {
		return Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
	}
	
	private Calendar getPekinTime() {
		return Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
	}
	
	public boolean isDateTheSame() {
		Calendar newYorkTime = getNewYorkTime();
		Calendar pekinTime = getPekinTime();
		return (newYorkTime.get(Calendar.YEAR) == pekinTime.get(Calendar.YEAR) &&
                newYorkTime.get(Calendar.DAY_OF_YEAR) == pekinTime.get(Calendar.DAY_OF_YEAR));

	}
}
