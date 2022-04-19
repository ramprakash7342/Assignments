//2)	Write an application to store 10 unique product objects. In case there is an attempt to add a duplicate product, 
//    it should be silently rejected. Hint: Use HashSet or TreeSet
package assignment;

import java.util.Scanner;
import java.util.TreeSet;

public class Question2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(ts.size()<10)
		{
			System.out.println("current size of TreeSet is "+ts.size()+" add more product");
			ts.add(sc.nextInt());
		}
		System.out.println("10 Unique Stored elements :");
		for(Integer t:ts)
		{
			System.out.print(t+" ");
		}
	}

}
