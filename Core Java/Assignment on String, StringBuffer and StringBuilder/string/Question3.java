//3) Given a String “Java String pool refers to collection of Strings which are stored in heap
//memory”, perform the following operations (Hint: all operation can be performed using
//String methods)
//a. Print the string to console in lowercase
//b. Print the string to console in uppercase
//c. Replace all ‘a’ character in the string with $ sign
//d. Check if the original String contains the word “collection”
//e. Check if the following String “java string pool refers to collection of strings which
//   are stored in heap memory” matches the original
//f. If the string does not match check if there is another method which can be used to
//    check if the strings are equal 

package string;

public class Question3 {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		
		//a
		System.out.println(str.toLowerCase());
		
		//b
		System.out.println(str.toUpperCase());
		
		//c
		System.out.println(str.replace('a', '$'));
		
		//d
		System.out.println(str.contains("collection"));
		
		//e
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.equals(str1));
		//gives false beacause  word "string" in str start with capital "S" and in str1 start with small "s" if we check with 
		//equalsIgnoreCase it will give true b/c it will ignore the case sensitivity
		System.out.println(str.equalsIgnoreCase(str1));
		
		//f
		
		System.out.println(str.compareTo(str1));//give -value
		System.out.println(str.compareToIgnoreCase(str1));//give 0 b/c now strings are equal;
		

	}

}
