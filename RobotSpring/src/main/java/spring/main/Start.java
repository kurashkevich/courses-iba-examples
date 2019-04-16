package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.impls.robot.ModelT1000;
import spring.interfaces.Robot;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Robot t1000 = (ModelT1000) context.getBean("t1000");
		t1000.dance();
	}
}
