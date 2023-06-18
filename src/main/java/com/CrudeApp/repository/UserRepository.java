package com.CrudeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CrudeApp.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	
	
}
