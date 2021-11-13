package spring.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.lab1.point3.*;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		System.out.println("SBU details");
		System.out.println("------------------------------");
		SBU sbu=ctx.getBean("SBU",SBU.class);
		sbu.ShowEmployeeDetails();
		System.out.println(sbu.toString());
		
		((AbstractApplicationContext) ctx).close();
	}
}
