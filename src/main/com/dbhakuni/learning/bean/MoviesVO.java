/**
 * 
 */
package com.dbhakuni.learning.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author digvijayb
 *
 */
@Document(collection="myMovies")
public class MoviesVO {


	@Id
	private String id;
	
	private String name;
	private String language;
	private String nation;
	private String year;
	private double rating;
	private List<String> genre;
	
	public MoviesVO(String id, String name, String language, String nation,
			String year, double rating, List<String> genre) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.nation = nation;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
	}
	
	public MoviesVO(String id){
		this.id = id;
	}
	
	/**
	 * 
	 */
	public MoviesVO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}
	
	
	

}
