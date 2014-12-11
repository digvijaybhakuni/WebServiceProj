/**
 * 
 */
package com.dbhakuni.learning.dao;

import java.util.List;

import com.dbhakuni.learning.bean.MoviesVO;

/**
 * @author digvijayb
 *
 */
public interface MyMoviesDataDAO {

	
	List<MoviesVO> getAllMoviesList();
	
}
