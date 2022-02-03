//4) Design a class named Pair which has two properties. The name of the first property is key
//and that of the second property is value. When designing the class take case of the following
//scenarios:
//		a. Create an Object of Pair class to store String value for the property key and String
//		value for the property value. Restriction Apart from String type no other types should
//		be acceptable as Key or value input 
//		e.g.
//		myObj.setKey(“1”);
//		myObj.setValue(“Hello”);
//				
//		b. Create an object of the class Pair to store String value for the property key and
//		java.util.Date as value for the property value
//		myObj.setKey(“Today is”);
//		myObj.setValue(new java.util.Date()); 


package assignment;
import java.util.*;
class Pair<T,U>{
	private T key;
	private U value;
	
	public Pair(T key, U value) {
		super();
		this.key = key;
		this.value = value;
	}

	public T getKey() {
		return key;
	}

	public U getValue() {
		return value;
	}
	
	
}
public class Question4 {


	public static void main(String[] args) {
      		Pair<String,String>  p=new Pair<String,String>("1","Ram");
      		Pair<String,Date>   p1=new Pair<String,Date>("Sanjay",new java.util.Date());
      		
      		System.out.println(p.getKey()+" "+p.getValue());
      		System.out.println(p1.getKey()+" "+p1.getValue());
      		
	}

}
