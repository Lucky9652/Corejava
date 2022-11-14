package Lesson5String;

import java.time.LocalDate;
import java.time.Month;
/**
 * This program demonstrates on use of LocalDate class
 *
 */

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate= LocalDate.now();
		LocalDate independenceDay=LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println("independence :" + independenceDay);
		System.out.println("Tday :" + currentDate);
		System.out.println("Tomorrow:" + currentDate.plusDays(10));
		System.out.println("Last Month:" + currentDate.isLeapYear());
		System.out.println("Is Leap?:" + currentDate.isLeapYear());
		System.out.println("Move to 5th day of month:" + currentDate.withDayOfMonth(5));
		System.out.println("Number of days int this month:" + currentDate.lengthOfMonth());
		
		
		
		
		

	}

}
