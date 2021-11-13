package spring.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.lab1.point2.Employee;

public class App2 {
	
	public static void main(String[] args) {
		
	//	Problem statement-1.2: Injecting dependencies
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		System.out.println("Employee details");
    	System.out.println("-----------------------------------");
		
		Employee emp=ctx.getBean("ID1", Employee.class);
		System.out.println(emp.toString());
		


		
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
