package com.example.cuedApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudeApp.entity.UserEntity;
import com.CrudeApp.repository.UserRepository;
@Service
public class ServiceClass {

	@Autowired
	public UserRepository repo;
	
	// to add data  
	public UserEntity saveUser(UserEntity user) {
		return repo.save(user) ;
	}

	public List  <UserEntity>  showUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}
