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

	MoviesVO getMoviesById(MoviesVO moviesVO);

	MoviesVO addMovies(MoviesVO moviesVO);

	MoviesVO updateMovies(MoviesVO moviesVO);

	MoviesVO deleteMoviesById(MoviesVO moviesVO);
	
}
