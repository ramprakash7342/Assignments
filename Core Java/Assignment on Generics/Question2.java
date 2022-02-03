//2) Write an application to hold 10 random int values as keys and 10 random double values as
//   values for a HashMap. Print the data store in the HashMap. Note: Keys can only be int and 
//   values double 

package assignment;
import java.util.Random;
import java.util.*;

public class Question2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Random rn=new Random();
        HashMap<Integer,Double> hm=new HashMap<Integer,Double>();
        for(int i=0;i<10;i++)
        {
        	hm.put(rn.nextInt(50), rn.nextDouble(50));
        }
        for(Map.Entry m:hm.entrySet())
        {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}
