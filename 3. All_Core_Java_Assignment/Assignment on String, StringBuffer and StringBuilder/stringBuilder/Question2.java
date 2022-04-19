//2) Insert the following string “insert text” into the string “It is used to _ at the specified index
//   position” at the location denoted by the sign _

package stringBuilder;

public class Question2 {

	public static void main(String[] args) {
	
		 StringBuilder str=new StringBuilder("It is used to  at the specified index position");
		 StringBuilder str1=new StringBuilder("insert text");
		 
		 System.out.println(str);
		 str.insert(14, str1);
		 System.out.println(str);
     
	}

}
