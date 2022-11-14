package Lesson5String;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
/*	DateTimeFormatter is used to configure the date time format
DateTimeFormatter can also be obtained by using ofPattern() 
which you can use for custom date and time format
*/

public class FormatingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter Formater= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter Formatter1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		LocalDate CurrentDate= LocalDate.now();
		LocalDateTime CurrentDateTime=LocalDateTime.now();
		System.out.println("CurrentDate.format(CurrentDate");
		System.out.println("CurrentDate.format(CurrentDateTime");
		
		

	}

}
