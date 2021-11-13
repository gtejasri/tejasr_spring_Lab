package spring.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring.lab1.model.Employee;

//Java based configuration
public class AppJavaConfig {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConifig.class);
		
		Employee emp=ctx.getBean(Employee.class);
		System.out.println(emp.toString());
		
		((AbstractApplicationContext) ctx).close();
		
	}

}
