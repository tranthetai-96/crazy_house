package com.fpt.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fpt.Dto.UserDTO;
import com.fpt.Service.IUserService;


@RestController
public class UserAPI {

	
	@Autowired
	private IUserService  iuserservice;
	
	@PostMapping(value = "/user")
	public UserDTO createNew(@RequestBody UserDTO model) {
		return iuserservice.save(model) ;
	}
	
	@PutMapping(value = "/user")
	public UserDTO updateNew(@RequestBody UserDTO model) {
		return model;
	}
	
	@DeleteMapping(value = "/user")
	public void deleteNew(@RequestBody long[] ids) {
		
	}
}
