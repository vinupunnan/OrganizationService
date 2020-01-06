package com.organization.api.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.organization.api.model.Employee;
import com.organization.api.model.EmployeeList;
import com.organization.api.model.OrgEmpDeptDetails;
import com.organization.api.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService{
    
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<OrgEmpDeptDetails> callDataSources() {
		
		EmployeeList employeeList = restTemplate.getForObject("http://localhost:8081/employee",EmployeeList.class );
		return employeeList.getEmployees().stream().map(employee ->{
			
		return new OrgEmpDeptDetails(employee.getEmpName(),employee.getEmpDesignation(),"hradcoded");
			
		}).collect(Collectors.toList());
		
	}

}