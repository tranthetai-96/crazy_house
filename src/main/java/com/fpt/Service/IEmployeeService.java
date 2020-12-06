package com.fpt.Service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.fpt.Dto.EmployeeDTO;


public interface IEmployeeService {
	EmployeeDTO save(EmployeeDTO employeeDTO);
	List<EmployeeDTO> findAll(Pageable pageable);
	int totallItem();
}
