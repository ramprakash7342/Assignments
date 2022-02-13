package assignment;

class singleton
{
	static singleton obj1 = new singleton();
	int a;
	private singleton()
	{
		System.out.println("Singleto class was created:");
		a=10;
	}
	public static singleton getinstance() {
		return obj1;
	}
}
public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton obj = singleton.getinstance();
		System.out.println(obj.a);
	}

}