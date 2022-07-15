package com.apptech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apptech.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsernameAndPassword(String un, String psw);
	
}
	


