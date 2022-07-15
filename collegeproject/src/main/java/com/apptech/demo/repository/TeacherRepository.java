

package com.apptech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apptech.demo.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

	Teacher findByUsernameAndPassword(String un, String psw);



	
	
}
	


