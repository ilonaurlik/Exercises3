import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * What time is now in Pekin?
 */

public class Exercise05 {
	public ZonedDateTime getTimeInPekin() {
		return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
	}
}
