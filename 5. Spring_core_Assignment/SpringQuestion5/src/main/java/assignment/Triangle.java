package assignment;

import javax.annotation.Resource;

public class Triangle implements Shape{
 
	private point pointA;
	private point pointB;
	private point pointC;
	
	

	public point getPointA() {
		return pointA;
	}



	public void setPointA(point pointA) {
		this.pointA = pointA;
	}



	public point getPointB() {
		return pointB;
	}


    @Resource(name="point")
	public void setPointB(point pointB) {
		this.pointB = pointB;
	}



	public point getPointC() {
		return pointC;
	}


    @Resource
	public void setPointC(point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A= ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B= ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C= ("+getPointC().getX()+","+getPointC().getY()+")");
	}
}
