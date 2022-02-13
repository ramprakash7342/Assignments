//“A quick brown fox jumps over the lazy dog”. Create an ArrayList from the given
//String. Such an ArrayList should include each word from the given sentence. Finally
//convert such List to an array using Java 11 methods and print the output. 


package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		String str="A quick brown fox jumps over the lazy dog";
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(str.split(" ")));
		System.out.println(al);
		String[] strArr = al.toArray(n -> new String[n]);
		System.out.println(Arrays.toString(strArr));
	}

}
