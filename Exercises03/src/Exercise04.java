import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * What time is now in San Francisco?
 */

public class Exercise04 {
	public ZonedDateTime getTimeInSanFrancisco() {
		return ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
	}
}
