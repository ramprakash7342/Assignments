package Assignment;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square  implements ApplicationContextAware, BeanNameAware{

	private point pointA;
	private point pointB;
	private point pointC;
	private point pointD;
	private ApplicationContext context =null;
	
	
	
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

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is : "+beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

}
