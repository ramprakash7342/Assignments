//4)	Given a LinkedList of Objects representing date of birth’s (use any inbuild java class to represent date), print the 
//      date’s along with the message: Your date of Birth is DD-MM-YYYY, and it (was or was not) a leap year.
//E.g.
//     a)     For the date 23-12-2000 
//            Your date of birth is 23-12-2000 and it was a leap year


package assignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Question4 {
     public static boolean leapYear(int year) {
    	 if(year%400==0)
    		 return true;
    	 if(year%100==0)
    		 return false;
    	  if (year % 4 == 0)
    	        return true;
    	    return false;
     }
	
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>(); 
		Scanner sc = new Scanner(System.in);
  
	     System.out.println("Enter the Year of birth");
		 String y=sc.next();
		 ll.add(y);
		 System.out.println("Enter the month of birth");
		 String m=sc.next();
		 ll.add(m);
		 System.out.println("Enter the date of birth");
		 String d=sc.next();
		 ll.add(d);
		 
		 sc.close();
		 
		 Collections.reverse(ll);
		 if(leapYear(Integer.parseInt(y)))
		 { 
			 int i=0;
			 System.out.print("Your date of birth is ");
			 for(String l:ll)
			 {
			 System.out.print(l);
			 if(i<2)
				 {
				   System.out.print("-"); 
				   i++;
				 }
			 }
			 System.out.print(" and it was a Leap year ");
			 
		 }
		 else
		 {
			 int i=0;
			 System.out.print("Your date of birth is ");
			 for(String l:ll)
			 {
				 System.out.print(l);
			     if(i<2)
			     {
			    	 System.out.print("-"); 
			         i++;
			     }
			 }
			 System.out.print(" and it was not a Leap year ");
		 }

	}

}
