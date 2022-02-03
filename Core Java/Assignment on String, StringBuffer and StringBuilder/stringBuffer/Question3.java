//3) Reverse the following string “This method returns the reversed object on which it was
//called” using StringBuffer Class
package stringBuffer;

public class Question3 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("This method returns the reversed object on which it was called");
        
		System.out.println(str);
		str.reverse();
		System.out.print(str);
	}

}
