package com.fpt.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fpt.Converter.EmployeeConverter;
import com.fpt.Dto.EmployeeDTO;
import com.fpt.Entity.EmployeeEntity;
import com.fpt.Repository.IEmployeeRepository;
import com.fpt.Service.IEmployeeService;
@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepository iemployeerepository;
	@Autowired
	private EmployeeConverter employeeconverter ;
	

	@Override
	public EmployeeDTO save(EmployeeDTO employeeDTO) {
		EmployeeEntity userEntity = new EmployeeEntity();
		if(employeeDTO.getId() != null) {
			EmployeeEntity oldUserEntity = iemployeerepository.findOne(employeeDTO.getId());
			userEntity = employeeconverter.toEntity(employeeDTO, oldUserEntity);
		}else {
			userEntity = employeeconverter.toEntity(employeeDTO);
		}
	//	RoleEntity role = roleRepository.findOneByCode(userDTO.getRolecode());
	//	UserEntity userEntity = userconverter.toEntity(userDTO);
	//	userEntity.setRole(role);
		userEntity = iemployeerepository.save(userEntity);
		return employeeconverter.toDTO(userEntity) ;
	}


	@Override
	public List<EmployeeDTO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int totallItem() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
