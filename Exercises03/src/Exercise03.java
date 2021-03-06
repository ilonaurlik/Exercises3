import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
	
/**
 * Calculate how many minutes is it until the new year.
 */

public class Exercise03 {
	private LocalDateTime convertToDate(String date) throws DateTimeParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return LocalDateTime.parse(date, formatter);
	}
	
	public long mainFunction(String input1, String input2) throws Exception {
		LocalDateTime date1;
		LocalDateTime date2;
		try {
			date1 = convertToDate(input1);
			date2 = convertToDate(input2);
		} catch (DateTimeParseException e) {
			throw new Exception("Error while parsing date. " + input1 + "," + input2);
		} 
		return getNumberOfMinutes(date1, date2);
	}
	
	private long getNumberOfMinutes(LocalDateTime date1, LocalDateTime date2) {
		return ChronoUnit.MINUTES.between(date1, date2);
	}
}