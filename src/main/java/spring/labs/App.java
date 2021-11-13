package spring.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.lab1.model.Employee;

/**
 * Spring Labs
 *
 */
//XML configuration
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	
    	//Problem statement-1.1: Injecting dependencies
    	System.out.println("Employee details");
    	System.out.println("-----------------------------------");
    	Employee emp1=ctx.getBean("employee",Employee.class);
    	System.out.println(emp1.toString());
    	
    	
    	
    	((AbstractApplicationContext) ctx).close();
    }
}
