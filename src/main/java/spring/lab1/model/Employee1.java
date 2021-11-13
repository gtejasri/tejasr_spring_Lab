package spring.lab1.model;

import org.springframework.stereotype.Component;

@Component
public class Employee1 {
	private int ID;
	private String Name;
	private Double Salary;
	private String BU;
	private int Age;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int iD, String name, Double salary, String bU, int age) {
		super();
		ID = iD;
		Name = name;
		Salary = salary;
		BU = bU;
		Age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getBU() {
		return BU;
	}

	public void setBU(String bU) {
		BU = bU;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Employee1 [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", BU=" + BU + ", Age=" + Age + "]";
	}
	


}
