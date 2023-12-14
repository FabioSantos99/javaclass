package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		LocalDate d01 = LocalDate.parse("2023-12-13");
		LocalDateTime d02 = LocalDateTime.parse("2023-12-13T16:47:25");
		Instant d03 = Instant.parse("2023-12-13T16:47:25Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(5);
		LocalDate nextWeekLocalDate = d01.plusDays(12);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(5);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(12);
		
		
		System.out.println("pastWeekLocalCate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalCate: " + nextWeekLocalDate);

		System.out.println("pastWeekLocalCateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalCateTime: " + nextWeekLocalDateTime);
	
		Instant pastWeekInstant = d03.minus(5, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(12, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalInstant: " + pastWeekInstant);
		System.out.println("nextWeekLocalInstant: " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		
		System.out.println("ti dias = " + t1.toDays());
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018 17:30:35");
		
		Date x4 = new Date(1000L * 110L * 60 * 15L);
		
		System.out.println();
		System.out.println(y1);
		System.out.println(sdf1.format(x4));

	};
	

}
