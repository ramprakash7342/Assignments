//Q5. Create a string that consists of the first letter of each word in the list of Strings provided. HINT: Use Consumer
//    interface & a String Builder to construct the result.

package assingment;

import java.util.Arrays;
import java.util.List;
interface Consumer{
	char firstChar(String s);
}
public class Assignment4Q5 {
	   
	    public static String processWords(List<String> list) {
	    	StringBuilder s=new StringBuilder("");
	    	list.forEach(p->s.append(p.charAt(0)));
	    	return s.toString();
	    }
	    
	    public static void main(String[] args) { 
	       
	    	List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
	    	System.out.println(Assignment4Q5.processWords(list));
	    }

}
