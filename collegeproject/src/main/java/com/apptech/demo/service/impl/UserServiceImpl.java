package com.apptech.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apptech.demo.model.User;
import com.apptech.demo.repository.UserRepository;
import com.apptech.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepo;
	@Override
	public void userSignup(User user) {
	 userRepo.save(user);
		
	}

	@Override
	public User login(String un, String psw) {
		
		
		return userRepo.findByUsernameAndPassword(un,psw);
	}

}
