package com.organization.api.model;

public class OrgEmpDeptDetails {
	
	public OrgEmpDeptDetails(String employeeName, String empDesignation, String departmentName) {
		super();
		this.employeeName = employeeName;
		this.empDesignation = empDesignation;
		this.departmentName = departmentName;
	}
	public String employeeName;
	public String empDesignation;
	public String departmentName;
	
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
	

}
