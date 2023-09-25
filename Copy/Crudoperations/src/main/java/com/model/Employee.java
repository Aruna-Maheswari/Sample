package com.model;

public class Employee {
	private int empid;
	private String empName;
	private String empbranch;
	private String empphno;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpbranch() {
		return empbranch;
	}
	public void setEmpbranch(String empbranch) {
		this.empbranch = empbranch;
	}
	public String getEmpphno() {
		return empphno;
	}
	public void setEmpphno(String empphno) {
		this.empphno = empphno;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, String empbranch, String empphno) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empbranch = empbranch;
		this.empphno = empphno;
	}
	
	

}
