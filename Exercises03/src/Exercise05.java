import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise05 {
	public ZonedDateTime getTimeInPekin() {
		return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
	}
}
