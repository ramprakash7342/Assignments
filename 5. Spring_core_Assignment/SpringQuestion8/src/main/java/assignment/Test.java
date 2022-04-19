package assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new  ClassPathXmlApplicationContext("Question8.xml");
		context.registerShutdownHook();
		Square sq= (Square) context.getBean("square");
		sq.draw();
	}

}
