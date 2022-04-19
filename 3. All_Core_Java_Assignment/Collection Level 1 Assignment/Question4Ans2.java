package assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Question4Ans2 {

	public static void main(String[] args) {
		LinkedList<LocalDate> ll=new LinkedList<LocalDate>();
 		
		LocalDate ld=LocalDate.of(2003, 8, 12);
		LocalDate ld1=LocalDate.of(2000, 4, 12);
		
		ll.add(ld);
		ll.add(ld1);
		DateTimeFormatter fm=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for(LocalDate LL:ll)
		{
			if(LL.isLeapYear())
				System.out.println("Your date of birth is "+LL.format(fm)+" and it was a Leap year.");
			else
				System.out.println("Your date of birth is "+LL.format(fm)+" and it was not a Leap year.");
		}

	}

}
