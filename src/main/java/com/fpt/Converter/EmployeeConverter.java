package com.fpt.Converter;

import org.springframework.stereotype.Component;

import com.fpt.Dto.EmployeeDTO;

import com.fpt.Entity.EmployeeEntity;
import com.fpt.Entity.UserEntity;



@Component
public class EmployeeConverter {
	
	public EmployeeEntity toEntity(EmployeeDTO dto) {
		EmployeeEntity entity =new EmployeeEntity();
		entity.setFullName(dto.getFullname());
		entity.setAddress(dto.getAddress());
		entity.setEmail(dto.getEmail());
		entity.setBirthday(com.fpt.common.utils.DateUtil.convertDateFromString(dto.getBirthday(),"yyyy-MM-dd"));
		entity.setImage(dto.getImage());
		entity.setPhone(dto.getPhone());
		entity.setStatus(dto.getStatus());
		entity.setEmployeeType(dto.getEmployeetype());
		
		return entity;
	}
	
	public EmployeeDTO toDTO(EmployeeEntity entity) {
		EmployeeDTO dto = new EmployeeDTO();
		if(entity.getIdemployee() != null) {
			dto.setId(entity.getIdemployee());
		}
		dto.setFullname(entity.getFullName()) ;
		dto.setAddress(entity.getAddress());
		dto.setEmail(entity.getEmail());
	//	com.fpt.common.utils.DateUtil.convertStringToDatesetBirthday((entity.getBirthday());
		
		dto.setImage(entity.getImage());
		dto.setPhone(entity.getPhone());
		dto.setStatus(entity.getStatus());
		dto.setEmployeetype(entity.getEmployeeType());
		return dto;
 }
	
	public EmployeeEntity toEntity(EmployeeDTO dto,EmployeeEntity entity) {
		
		entity.setFullName(dto.getFullname());
		entity.setAddress(dto.getAddress());
		entity.setEmail(dto.getEmail());
		entity.setBirthday(com.fpt.common.utils.DateUtil.convertDateFromString(dto.getBirthday(),"yyyy-MM-dd"));
		entity.setImage(dto.getImage());
		entity.setPhone(dto.getPhone());
		entity.setStatus(dto.getStatus());
		entity.setEmployeeType(dto.getEmployeetype());
		
		return entity;
	}
}
