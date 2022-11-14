package Lesson5String;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ZonedDateTime currentDate=ZonedDateTime.now();
		ZonedDateTime currentDateInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India: "+ currentTime);
		System.out.println("Paris: "+ currentTimeInParis);
		System.out.println("New York: "+ currentTimeInNewYork);
		*/
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India: "+ currentTime);
		System.out.println("Paris: "+ currentTimeInParis);
		System.out.println("New York: "+ currentTimeInNewYork);
		

	}

}
