import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
	
public class Exercise02 {
	private LocalDate convertToDate(String date) throws DateTimeParseException {
		return LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
	}
	
	public long mainFunction(String input1, String input2) throws Exception {
		LocalDate date1;
		LocalDate date2;
		try {
			date1 = convertToDate(input1);
			date2 = convertToDate(input2);
		} catch (DateTimeParseException e) {
			throw new Exception("Error while parsing date. " + input1 + "," + input2);
		} 
		return getNumberOfDays(date1, date2);
	}
		
	private long getNumberOfDays(LocalDate date1, LocalDate date2) {
		return ChronoUnit.DAYS.between(date1, date2);
	}
}