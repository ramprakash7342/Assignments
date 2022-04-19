//2) Insert the following string “insert text” into the string “It is used to _ at the specified index
//   position” at the location denoted by the sign _


package stringBuffer;

public class Question2 {

	public static void main(String[] args) {
	 StringBuffer str=new StringBuffer("It is used to  at the specified index position");
	 StringBuffer str1=new StringBuffer("insert text");
	 
	 
	 System.out.println(str);
	 str.insert(14, str1);
	 System.out.println(str);
     
	}

}
