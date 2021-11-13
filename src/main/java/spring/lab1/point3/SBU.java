package spring.lab1.point3;

import java.util.List;

public class SBU {
	
	private int sbuCode;
	private String sbuHead;
	private String sbuName;
	private List<Employee> empList;
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(int sbuCode, String sbuHead, String sbuName, List<Employee> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
		this.empList = empList;
	}
	public void ShowEmployeeDetails() {
		for(Employee employee:empList) {
			System.out.println(employee.toString());
		}
	}
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + ", empList=" + empList
				+ "]";
	}
	

}
