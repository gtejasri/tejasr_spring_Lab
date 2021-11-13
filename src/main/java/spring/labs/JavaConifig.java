package spring.labs;

import org.springframework.context.annotation.Bean;

import spring.lab1.model.Employee;

public class JavaConifig {
	
	@Bean
	public Employee employee() {
		return new Employee(1234,"Hairet",40000.0,"PES-BU",40);
	}

}
