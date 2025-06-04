package Time_Date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class E02_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		ZonedDateTime myTimezone=ZonedDateTime.now();
		System.out.println(myTimezone);
		Set<String> zoneid=ZoneId.getAvailableZoneIds();
		for(String tz:zoneid)
			System.out.println(tz);
		
		
	ZonedDateTime	bdTime=ZonedDateTime.now(ZoneId.of("Asia/Amman"));
		System.out.println(bdTime);
	}

}
