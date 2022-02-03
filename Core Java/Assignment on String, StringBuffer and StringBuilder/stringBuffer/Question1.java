//1) Write an application to append the following strings “StringBuffer”, “is a peer class of
//   String”, “that provides much of “, “the functionality of strings” using a StringBuffer

package stringBuffer;

public class Question1 {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("StringBuffer ");
		StringBuffer str2=new StringBuffer("is a peer class of String ");
		StringBuffer str3=new StringBuffer("that provides much of ");
		StringBuffer str4=new StringBuffer("the functionality of strings");
		
		
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