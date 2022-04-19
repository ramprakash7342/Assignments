package assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Square {

	private point pointA;
	private point pointB;
	private point pointC;
	private point pointD;
	
	public point getPointA() {
		return pointA;
	}

	public void setPointA(point pointA) {
		this.pointA = pointA;
	}

	public point getPointB() {
		return pointB;
	}

	public void setPointB(point pointB) {
		this.pointB = pointB;
	}

	public point getPointC() {
		return pointC;
	}

	public void setPointC(point pointC) {
		this.pointC = pointC;
	}

	public point getPointD() {
		return pointD;
	}

	public void setPointD(point pointD) {
		this.pointD = pointD;
	}
	
	public void draw() {
		System.out.println("Point A= ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B= ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C= ("+getPointC().getX()+","+getPointC().getY()+")");
		System.out.println("Point D= ("+getPointD().getX()+","+getPointD().getY()+")");
	}
	
	//Use @PostConstruct and @PreDestroy
	
	   @PostConstruct
	   public void initializeSqaure() {
		   System.out.println("Init of Square");
	   }
	   @PreDestroy
	   public void destroySquare() {
		   System.out.println("Destroy of Square");
	   }
	
	//Use init-method and destroy-method in xml config file
	public void myInIt() {
		System.out.println("my init method called for square");
	}
	
	public void cleanUp() {
		System.out.println("my distroy  method called for square");
	}
	
	
	
	 
	
}
