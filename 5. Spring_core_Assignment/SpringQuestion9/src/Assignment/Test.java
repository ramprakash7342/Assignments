package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Question9.xml");
		context.registerShutdownHook();
		Square sq=(Square) context.getBean("square");
		sq.draw();
	}

}
