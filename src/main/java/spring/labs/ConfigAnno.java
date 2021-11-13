package spring.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import spring.lab1.model.Employee1;



@ComponentScan
public class ConfigAnno {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigAnno.class);
		Employee1 emp=ctx.getBean(Employee1.class);
		System.out.println(emp.toString());
		((AbstractApplicationContext) ctx).close();
	}

}