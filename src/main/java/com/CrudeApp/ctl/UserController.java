package com.CrudeApp.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CrudeApp.entity.UserEntity;
import com.CrudeApp.repository.UserRepository;
import com.example.cuedApp.Service.ServiceClass;

@RestController
public class UserController {
	@Autowired
	public UserRepository repository ;
	@Autowired
	public ServiceClass serviceClass;
	@PostMapping("/addUser")
	public UserEntity addUser(@RequestBody UserEntity  entity ) {
	return 	serviceClass.saveUser(entity);
		
	}
	@GetMapping("/getUser")
	public List <UserEntity> getUser(  ) {
		return 	serviceClass.showUser();
	
	
	}
}
