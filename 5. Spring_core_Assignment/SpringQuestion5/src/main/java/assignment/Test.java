package assignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Circle cl=(Circle) context.getBean("circle");
		cl.draw();
		Triangle ta=(Triangle) context.getBean("triangle");
		ta.draw();

	}

}
