package anil.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private Integer movieId;
	
	private String name;
	
	private String leadActor;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Integer movieId, String name, String leadActor) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.leadActor = leadActor;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", leadActor=" + leadActor + "]";
	}
	
	
	
	

}
