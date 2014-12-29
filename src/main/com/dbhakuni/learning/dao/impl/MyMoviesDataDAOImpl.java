/**
 * 
 */
package com.dbhakuni.learning.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

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


	public MoviesVO getMoviesById(MoviesVO moviesVO) {
		return mongoOperations.findById(moviesVO.getId(), MoviesVO.class);
	}


	public MoviesVO addMovies(MoviesVO moviesVO) {
		mongoOperations.insert(moviesVO);
		return moviesVO;
	}


	public MoviesVO updateMovies(MoviesVO moviesVO) {
		mongoOperations.save(moviesVO);
		return moviesVO;
	}


	@SuppressWarnings("static-access")
	public MoviesVO deleteMoviesById(MoviesVO moviesVO) {
		mongoOperations.updateFirst(new Query().addCriteria(Criteria.where("_id").is(moviesVO.getId())), new Update().update("isDelete", true), MoviesVO.class);
		return moviesVO;
	}
	
	
	
	

}
