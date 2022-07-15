package com.apptech.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apptech.demo.model.Teacher;
import com.apptech.demo.repository.TeacherRepository;
import com.apptech.demo.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
  private TeacherRepository teacherRepo;
	@Override
	public void teacherSignup(Teacher teacher ) {
      teacherRepo.save(teacher);
		
	}

	@Override
	public Teacher log(String un, String psw) {
		
		
		return teacherRepo.findByUsernameAndPassword(un,psw);
	}

}
