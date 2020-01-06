package com.organization.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.api.model.OrgEmpDeptDetails;
import com.organization.api.service.impl.OrganizationServiceImpl;

@RestController
public class OrganizationController {
    
	@Autowired
	OrganizationServiceImpl orgServiceImpl;
	
	@RequestMapping("/organization")
	public List <OrgEmpDeptDetails> getDepartmentList() {
		
		return  orgServiceImpl.callDataSources();
				
		
		
	}
}
