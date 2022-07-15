package com.apptech.demo.service;

import com.apptech.demo.model.User;

public interface UserService {
	void userSignup(User user);
	User login ( String un,String psw);
	
	

}
