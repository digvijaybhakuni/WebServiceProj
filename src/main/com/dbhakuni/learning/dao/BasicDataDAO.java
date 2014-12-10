package com.dbhakuni.learning.dao;

import java.util.List;

import com.dbhakuni.learning.bean.StudentVO;

public interface BasicDataDAO {

	
	List<StudentVO> getAllStudents();
	StudentVO add(StudentVO studentVO);
	
}
