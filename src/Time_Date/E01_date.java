package Time_Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E01_date {

	public static void main(String[] args) {
		String date1="Mar 23, 2023";
		String date2="30/02/2024";
		LocalDate Mydate=LocalDate.parse(date2,DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
		LocalDate date=LocalDate.parse(date1,DateTimeFormatter.ofPattern("MMM dd, yyyy")); // converting java date formate
		System.out.println(date);
		
		 System.out.println("Is this date "+date+"  "+date.isLeapYear());
		 System.out.println("Is this date "+date+"  "+date.getDayOfMonth());
		 System.out.println("Is this date "+date+"  "+date.getMonth());
		 
		 System.out.println(date.until(Mydate,ChronoUnit.WEEKS)+" weeks");
		 

	}

}
