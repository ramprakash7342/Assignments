package assignment;

abstract class abstractClass{
	abstract void print();
}
class abstractClass2 extends abstractClass{

	@Override
	void print() {
		System.out.println("print method of abstractClass2");
		
	}
	
}
public class Assignment2Q4 extends abstractClass2 {

	public static void main(String[] args) {
		//abstractClass ob1=new abstractClass(); not possible
		
		Assignment2Q4 ob=new Assignment2Q4();
		abstractClass2 ob2=new abstractClass2();
		ob.print();
		ob2.print();

	}

}
