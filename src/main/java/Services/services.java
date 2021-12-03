package Services;

import java.util.List;

import org.springframework.stereotype.Service;

import Models.Movies;

@Service
public class services {
	public List<Movies> movies;
		
	public services(List<Movies> movie) {
		this.movies = movie;
	}
	
	public List<Movies> getMovie() {
		return movies;
	}

	public void setMovie(List<Movies> movie) {
		this.movies = movie;
	}

	public Movies createMovie(Movies movie) {
		movies.add(movie);
		return movie;
	}
	
	public boolean deleteMovie(Integer id) {
		for(Movies m: movies) {
			if(m.getId().equals(id)) {
				movies.remove(m);
				return true;
			}
		}
		return false;
	}
	
	public Movies updateMovie(Movies movie) {
		for(Movies m: movies) {
			if(m.getId().equals(movie.getId())) {
				movies.remove(m);
				movies.add(movie);
			}
		}
		return movie;
	}
}
