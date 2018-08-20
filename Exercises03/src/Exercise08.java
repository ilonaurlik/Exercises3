import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise08 {
	private final String DATE = "1912-04-15 02:20";
	private static final ZoneId TIMEZONE_CENTRAL_EUROPEAN_TIME = ZoneId.of("Europe/Warsaw");
	private static final ZoneId TIMEZONE_AMERICA_EST = ZoneId.of("America/New_York");
	
	public String getDateInPoland() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime localtDateAndTime = LocalDateTime.parse(DATE, formatter);
		ZonedDateTime dateAndTimeInPoland = ZonedDateTime.of(localtDateAndTime, TIMEZONE_AMERICA_EST);
		ZonedDateTime utcDate = dateAndTimeInPoland.withZoneSameInstant(TIMEZONE_CENTRAL_EUROPEAN_TIME);
		return formatter.format(utcDate);
	}
}
