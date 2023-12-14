package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2023-12-13");
		LocalDateTime d02 = LocalDateTime.parse("2023-12-13T16:47:25");
		Instant d03 = Instant.parse("2023-12-13T16:47:25Z");
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Japan"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("Japan"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println(d01.getYear());
		System.out.println(d02.getHour() + ":" + d02.getMinute()
		+ ":"+ d02.getSecond());

		
		
	}
}


/*
for (String s: ZoneId.getAvailableZoneIds()) {
	
	System.out.println(s);
}
*/