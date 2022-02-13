//Q7. Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. 
//    HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.

package assingment;

import java.util.HashMap;
//import java.util.Map;

public class Assignment4Q7 {

	
	public String convertKeyValueToString(HashMap<String, Integer> map) {
		StringBuilder s=new StringBuilder("");
//      without lambda and stream api		
//		for(Map.Entry m:map.entrySet())
//		{
//			s=s.append(m.getKey());
//			s=s.append(m.getValue());
//		}
		
//     with lambda and stream api
		map.entrySet()
	      .forEach(entry ->
	        s.append(entry.getKey())
	          .append(entry.getValue()));
		return s.toString();
	}

	public static void main(String[] args) {
    HashMap<String , Integer>  hm=new HashMap<String,Integer>();
    hm.put("One-",1);
    hm.put("Two-",2);
    hm.put("Three-",3);
    hm.put("Four-", 4);
    hm.put("Six-", 6);
    hm.put("Five-",5 );

    Assignment4Q7 as=new Assignment4Q7();
    System.out.print(as.convertKeyValueToString(hm));
	}

}
