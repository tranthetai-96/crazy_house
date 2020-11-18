package com.fpt.Service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.fpt.Dto.UserDTO;

public interface IUserService {
	UserDTO save(UserDTO userDTO);
	//UserDTO update(UserDTO userDTO);
	List<UserDTO> findAll(Pageable pageable);
	int totallItem();

}
