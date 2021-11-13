package spring.lab1.point3;

public class Employee {
	
	private int empAge;
	private int empId;
	private String empName;
	private String empSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empAge, int empId, String empName, String empSalary) {
		super();
		this.empAge = empAge;
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ "]";
	}
	
	
	

}
