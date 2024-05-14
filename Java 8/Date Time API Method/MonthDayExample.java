package JDK8;

import java.time.*;  

public class MonthDayExample {
	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    LocalDate date = month.atYear(2024);  
	    System.out.println(date);  
	  }  
	}  
