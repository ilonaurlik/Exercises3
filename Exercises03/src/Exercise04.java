import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise04 {
	public ZonedDateTime getTimeInSanFrancisco() {
		return ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
	}
}
