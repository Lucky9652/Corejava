package Lesson5String;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * This program will demonstrate on how to calculate difference between two dates
 */
public class CalculatingPeriod {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start=new LocalDate.of(1947,Month., 10);
		LocalDate end=LocalDate.now();
		Period period=start.until(end);
		System.out.println("Days:" + period.getDays());
		System.out.println("Months:" + period.getMonths());
		*/
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2000,Month.OCTOBER,16);
		LocalDate end = LocalDate.of(2001,Month.APRIL,10);
		
		Period period = start.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());//Calculating period from one date to another date
	}
	
}
	
		
	

	

