//Q5. Write the classes Line, Rectangle, Cube etc. & make the Shape as their base class. Add an abstract draw() method in the class Shape & draw 
//all shapes
package assignment;

abstract class Shape5 {
    abstract public String draw();
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle is drawn...";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line is drawn...";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube is drawn...";
    }
}

public class Assignment2Q5 {

	public static void main(String[] args) {
		Shape5 ob;
		ob=new Line5();
		System.out.println(ob.draw());
		
		ob=new Rectangle5();
		System.out.println(ob.draw());
		
		ob=new Cube5();
		System.out.println(ob.draw());
      
	}

}

