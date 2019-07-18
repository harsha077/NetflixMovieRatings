package com.netflix.stars.dto;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

//@Entity
//@Table(name="movie_stars")
public class MovieStars {

	private int id;
	private String numOfStars;
	
	public MovieStars() {
		
	}
	
	public MovieStars(int id, String numOfStars) {
		this.id = id;
		this.numOfStars = numOfStars;
	}
	
	//@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	//@Column(name="no_of_stars")
	public String getNumOfStars() {
		return numOfStars;
	}

	public void setNumOfStars(String numOfStars) {
		this.numOfStars = numOfStars;
	}
	
}
