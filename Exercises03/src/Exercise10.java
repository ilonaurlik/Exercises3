import java.time.LocalDateTime;

/**
 * Is the bank open at this time, assuming that open hours are following: Mon - Fri 8:00 - 17:00, Sat 10:00 - 15:00?
 */

public class Exercise10 {
	private static LocalDateTime getCurrentDate() {
		return LocalDateTime.now();
	}
	
	private enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

	private int setOpenFrom() {
		int result = getDayOfTheWeek().equals(Day.SATURDAY.toString()) ? 10 : 8;
		return result;
	}
	
	private int setOpenTo() {
		int result = getDayOfTheWeek().equals(Day.SATURDAY.toString()) ? 15 : 17;
		return result;
	}

	private String getDayOfTheWeek() {
		String result = getCurrentDate().getDayOfWeek().name();
		return result;
	}
	
	private int getHourOfDay() {
		int result = getCurrentDate().getHour();
		return result;
	}
	
	public boolean isBankOpen() {
		return (getHourOfDay() >= setOpenFrom() && getHourOfDay() < setOpenTo());
	}
}
