import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise07 {
	private final String DATE = "2018-08-03 19:40";
	private static final ZoneId TIMEZONE_CENTRAL_EUROPEAN_TIME = ZoneId.of("Europe/Warsaw");
	private static final ZoneId TIMEZONE_AMERICA_CST = ZoneId.of("America/Chicago");

	public String getChicagoDate() {		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime localtDateAndTime = LocalDateTime.parse(DATE, formatter);
		ZonedDateTime dateAndTimeInChicago = ZonedDateTime.of(localtDateAndTime, TIMEZONE_CENTRAL_EUROPEAN_TIME);
		ZonedDateTime utcDate = dateAndTimeInChicago.withZoneSameInstant(TIMEZONE_AMERICA_CST);
		return formatter.format(utcDate);
	}
}
