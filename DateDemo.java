package Lesson5String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date date=new Date();
    	//System.out.println(date.toGMTString());//Current date syntax
		
		/*public static void main(String[] args) {
Date date=new Date();
System.out.println(date.toGMTString());//current date
*/

public static void main(String[] args) {
	 Date dNow =new Date();
	 SimpleDateFormat ft=  new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	 System.out.println("Current Date: " + ft.format(dNow));//Comparison Date
	 
	
	 
}
	// TODO Auto-generated method stub


			
		}
		

	



