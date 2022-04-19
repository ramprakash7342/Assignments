//1) Write an application to append the following strings “StringBuffer”, “is a peer class of
//   String”, “that provides much of “, “the functionality of strings” using a StringBuffer

package stringBuilder;

public class Question1 {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("StringBuffer ");
		StringBuilder str2=new StringBuilder("is a peer class of String ");
		StringBuilder str3=new StringBuilder("that provides much of ");
		StringBuilder str4=new StringBuilder("the functionality of strings");
		
		
		System.out.println(str1);//original str1 
		str1.append(str2);
		//above append command change the str1 but this is not possible in string class b/c string class is immutable so we can 
		//only create new strings but cannot change old created string 
		System.out.println(str1);		
		str1.append(str3);
		str1.append(str4);
		System.out.println(str1);

	}

}
