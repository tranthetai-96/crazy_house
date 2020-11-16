package com.fpt.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpt.Converter.UserConverter;
import com.fpt.Dto.UserDTO;
import com.fpt.Entity.RoleEntity;
import com.fpt.Entity.UserEntity;
import com.fpt.Repository.IRoleRepository;
import com.fpt.Repository.IUserRepository;
import com.fpt.Service.IUserService;

public class UserService implements IUserService {

	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private IRoleRepository roleRepository;
	@Autowired
	private UserConverter userconverter;
	@Override
	public UserDTO save(UserDTO userDTO) {
		RoleEntity role = roleRepository.findOneByCode(userDTO.getRolecode());
		UserEntity user = userconverter.toEntity(userDTO);
		user.setRole(role);
		user = userRepository.save(user);
		return userconverter.toDTO(user) ;
	}

}

