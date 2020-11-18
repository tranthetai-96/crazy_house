package com.fpt.Converter;


import org.springframework.stereotype.Component;

import com.fpt.Dto.UserDTO;

import com.fpt.Entity.UserEntity;

@Component
public class UserConverter {
	 public UserEntity toEntity(UserDTO dto) {
		 
		 UserEntity entity =new UserEntity();
		 entity.setUserName(dto.getUsername());
		 entity.setFullName(dto.getFullname());
		 entity.setPassword(dto.getPassword());
		 entity.setStatus(dto.getStatus());
		 return entity;
		}

		public UserDTO toDTO(UserEntity entity) {
			UserDTO dto = new UserDTO();
			if(entity.getIdUser() != null) {
				dto.setId(entity.getIdUser());
			}
			dto.setUsername(entity.getUserName());
			dto.setFullname(entity.getFullName());
			dto.setPassword(entity.getPassword());
			dto.setStatus(entity.getStatus());
			return dto;
	 }
		
		public UserEntity toEntity(UserDTO dto , UserEntity entity) {
			 
			 entity.setUserName(dto.getUsername());
			 entity.setFullName(dto.getFullname());
			 entity.setPassword(dto.getPassword());
			 entity.setStatus(dto.getStatus());
			 return entity;
			}
}
