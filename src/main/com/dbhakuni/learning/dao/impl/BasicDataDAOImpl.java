/**
 * 
 */
package com.dbhakuni.learning.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dbhakuni.learning.bean.StudentVO;
import com.dbhakuni.learning.dao.BasicDataDAO;

/**
 * @author root
 *
 */
public class BasicDataDAOImpl implements BasicDataDAO {

	/**
	 * 
	 */
	public BasicDataDAOImpl() {
		System.out.println("BasicDataDAOImpl New  Object");
	}

	/* (non-Javadoc)
	 * @see com.dbhakuni.learning.dao.BasicDataDAO#getAllStudents()
	 */
	public List<StudentVO> getAllStudents() {
		
		List<StudentVO> studentVOs = new ArrayList<StudentVO>(5);
		
		studentVOs.add(new StudentVO("Sparrow", "B.Tech", 27));
		studentVOs.add(new StudentVO("Digvijay", "B.Sc IT", 24));
		studentVOs.add(new StudentVO("Santosh", "B.Tech", 25));
		studentVOs.add(new StudentVO("Pankaj", "MCA", 25));
		
		return studentVOs;
	}

}
