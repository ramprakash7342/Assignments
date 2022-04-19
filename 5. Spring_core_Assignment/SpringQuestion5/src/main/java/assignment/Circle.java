package assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	public point center;
	public int radius;
    public int area;
    
	

	public point getCenter() {
		return center;
	}
	

	@Required
	@Autowired
	public void setCenter(point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: ("+center.getX()+","+center.getY()+")"); 
	}
 
	
}
