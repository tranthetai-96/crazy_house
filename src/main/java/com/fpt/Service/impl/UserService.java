package com.fpt.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fpt.Converter.UserConverter;
import com.fpt.Dto.UserDTO;
import com.fpt.Entity.RoleEntity;
import com.fpt.Entity.UserEntity;
import com.fpt.Repository.IRoleRepository;
import com.fpt.Repository.IUserRepository;
import com.fpt.Service.IUserService;

@Service
public class UserService implements IUserService {

	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private IRoleRepository roleRepository;
	@Autowired
	private UserConverter userconverter;
	@Override
	public UserDTO save(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		if(userDTO.getId() != null) {
			UserEntity oldUserEntity = userRepository.findOne(userDTO.getId());
			userEntity = userconverter.toEntity(userDTO, oldUserEntity);
		}else {
			userEntity = userconverter.toEntity(userDTO);
		}
		RoleEntity role = roleRepository.findOneByCode(userDTO.getRolecode());
	//	UserEntity userEntity = userconverter.toEntity(userDTO);
		userEntity.setRole(role);
		userEntity = userRepository.save(userEntity);
		return userconverter.toDTO(userEntity) ;
	}
//	@Override
//	public UserDTO update(UserDTO userDTO) {
//		UserEntity oldUser = userRepository.findOne(userDTO.getId());
//		UserEntity userEntity = userconverter.toEntity(userDTO, oldUser);
//		RoleEntity role = roleRepository.findOneByCode(userDTO.getRolecode());
//		userEntity.setRole(role);
//		userEntity = userRepository.save(userEntity);
//		return userconverter.toDTO(userEntity);
//	}
	@Override
	public List<UserDTO> findAll(Pageable pageable) {
		List<UserDTO> results =new ArrayList<>();
		List<UserEntity> entities = userRepository.findAll(pageable).getContent();
		for(UserEntity item:entities) {
			UserDTO userdto = userconverter.toDTO(item);
			results.add(userdto);
		}
		return results;
	}
	
	@Override
	public int totallItem() {
		// TODO Auto-generated method stub
		
		return (int) userRepository.count();
	}

}

