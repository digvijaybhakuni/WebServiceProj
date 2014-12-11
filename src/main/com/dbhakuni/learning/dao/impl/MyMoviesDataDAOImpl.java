/**
 * 
 */
package com.dbhakuni.learning.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;

import com.dbhakuni.learning.bean.MoviesVO;
import com.dbhakuni.learning.dao.MyMoviesDataDAO;

/**
 * @author digvijayb
 *
 */
public class MyMoviesDataDAOImpl implements MyMoviesDataDAO {

	/**
	 * 
	 */
	public MyMoviesDataDAOImpl() { }
	
	MongoOperations mongoOperations = null;


	public void setMongoOperations(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}


	public List<MoviesVO> getAllMoviesList() {
		return mongoOperations.findAll(MoviesVO.class, "myMovies");
	}
	
	
	
	

}
