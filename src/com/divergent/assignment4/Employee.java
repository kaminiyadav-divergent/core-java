package com.divergent.assignment4;

public class Employee implements Cloneable{
	private int empId;
	private String empName;
	private  String Company;
	private Adress adress;
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
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		emp.setAdress((Adress)adress.clone());
		return emp;
	}
	public Employee(int empId, String empName, String company, Adress adress) {
		super();
		this.empId = empId;
		this.empName = empName;
		Company = company;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Company=" + Company + ", adress=" + adress
				+ "]";
	}
	
	
	
	
	
}
