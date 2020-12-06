package com.fpt.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.Dto.EmployeeDTO;
import com.fpt.Service.IEmployeeService;
import com.fpt.Service.IUserService;


@RestController
public class EmployeeAPI {

	@Autowired
	private IEmployeeService  iemployeeservice;
	
	@PostMapping(value = "/employee")
	public EmployeeDTO createNew(@RequestBody EmployeeDTO model ) {
		return iemployeeservice.save(model);
	}
}
