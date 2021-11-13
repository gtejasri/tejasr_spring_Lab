package spring.lab1.point2;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private int empAge;
	private SBU sbudetails;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double empSalary, int empAge, SBU sbudetails) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
		this.sbudetails = sbudetails;
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public SBU getSbudetails() {
		return sbudetails;
	}
	public void setSbudetails(SBU sbudetails) {
		this.sbudetails = sbudetails;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ ", sbudetails=" + sbudetails + "]";
	}
	

}
