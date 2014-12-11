/**
 * 
 */
package com.dbhakuni.learning.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.dbhakuni.learning.bean.StudentVO;
import com.dbhakuni.learning.dao.BasicDataDAO;

/**
 * @author root
 *
 */
public class BasicDataDAOImpl implements BasicDataDAO {

	MongoTemplate mongoTemplate = null;
	
	public BasicDataDAOImpl(MongoTemplate mongoTemplate){
		this.mongoTemplate = mongoTemplate;
	}
	
	
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	/**
	 * 
	 */
	public BasicDataDAOImpl() {
		System.out.println("BasicDataDAOImpl New  Object");
	}

	/**
	 * @see com.dbhakuni.learning.dao.BasicDataDAO#getAllStudents()
	 */
	public List<StudentVO> getAllStudents() {
		
		List<StudentVO> studentVOs = mongoTemplate.findAll(StudentVO.class);
		//List<StudentVO> studentVOs = new ArrayList<StudentVO>(5);
		//studentVOs.add(new StudentVO("Sparrow", "B.Tech", 27));
		//studentVOs.add(new StudentVO("Digvijay", "B.Sc IT", 24));
		//studentVOs.add(new StudentVO("Santosh", "B.Tech", 25));
		//studentVOs.add(new StudentVO("Pankaj", "MCA", 25));
		
		return studentVOs;
	}
	
	
	public StudentVO add(StudentVO studentVO){
		mongoTemplate.save(studentVO);
		return studentVO;
	}

}
