package fr.sopra.training;

import java.util.Date;
import java.util.List;

public class Movie {

	String id;
	String name;
	Date releaseDate;
	Studio studio;
	Realisator realisator;
	List<Actor> actors;
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
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Studio getStudio() {
		return studio;
	}
	public void setStudio(Studio studio) {
		this.studio = studio;
	}
	public Realisator getRealisator() {
		return realisator;
	}
	public void setRealisator(Realisator realisator) {
		this.realisator = realisator;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	
	
	
}
