package com.fpt.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.Api.output.UserOutput;
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
	
	@PutMapping(value = "/user/{id}")
	public UserDTO updateNew(@RequestBody UserDTO model, @PathVariable("id") long id) {
		model.setId(id);
		
		return iuserservice.save(model);
	}
	
//	@DeleteMapping(value = "/user")
//	public void deleteNew(@RequestBody long[] ids) {
//		
//	}
	
	@GetMapping(value = "/user")
	public  UserOutput showUser(@RequestParam("page") int page,
								@RequestParam("limit") int limit) {
		UserOutput result = new UserOutput() ;
		result.setPage(page);
		Pageable pageable = new PageRequest(page-1,limit) ;
		result.setUsers(iuserservice.findAll(pageable));
		result.setTotalPage((int) Math.ceil((double)(iuserservice.totallItem())/limit));
		return result ;
	}
}
