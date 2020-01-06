package com.organization.api.model;

public class OrgEmpDeptDetails {
	
	
	private  String employeeName;
	public OrgEmpDeptDetails(String employeeName, String empDesignation, String departmentName, String deptLocation) {
		super();
		this.employeeName = employeeName;
		this.empDesignation = empDesignation;
		this.departmentName = departmentName;
		this.deptLocation = deptLocation;
	}
	private  String empDesignation;
	private  String departmentName;
	private  String  deptLocation;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	
	

}
