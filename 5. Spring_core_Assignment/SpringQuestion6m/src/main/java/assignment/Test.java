package assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Question6.xml");
		Deatails database = (Deatails) context.getBean("deatails");
		System.out.println(database);

	}

}
