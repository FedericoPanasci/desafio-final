package com.example.demo.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import Repository.MovieRepository;
import Models.Movies;

@Service
public class services {
	
	private final MovieRepository movieRepository;
	
	@Autowired
	public services ( MovieRepository movieRepository){
	this.movieRepository=movieRepository;
	}
	
	public List<Movies> getMovies(){
		return movieRepository.findAll();
	}
	
	public Movies createMovie(Movies movie) {
		return movieRepository.save(movie);
	}
	
	public void deleteById(Integer id) {
		movieRepository.deleteById(id);
	}
	

	public Movies updateMovie(Movies peli, Integer id) throws Exception{
		try {
			Optional<Movies> peliuptade = movieRepository.findById(id);
			if (!peliuptade.isEmpty()) {
				return movieRepository.save(peli);			
			}
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
		return null;
		
	}
	
	public Optional<Movies> findId(Integer id) {
		return movieRepository.findById(id);
	}
	
	public List<Movies> findTitle(String title){	
		return movieRepository.findByTitle(title);
		
	}

	public List<Movies> topMovies() {
		return movieRepository.filterPopular(PageRequest.of(0,3));
	}

	public List<Movies> findClassified(String classified) {
		return movieRepository.findATP();
	}
	
	
	
//	
//	public Movies findTitle(String title) {
//		return movieRepository.findAllById(null);
//	}
	
	//public List<Movies> movies;
	/*
	public Repository<Movies, Integer> repo;
	
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

	
	
	public List<Movies> findClassified(String classified){
	    return movies.stream().filter(m -> m.getClassified().equals(classified)).collect(Collectors.toList());
	}

	public List<Movies> topMovies(){
	    return movies.stream().sorted(Comparator.comparing(Movies::getRate).reversed()).limit(3).collect(Collectors.toList());
	}
	
	/*public List<Movies> topRate() {
		Integer rated1 = 0;
		Integer rated2 = 0;
		Integer rated3 = 0;
		for(Integer i = 0; i < movies.size(); i++) {
			if(movies.get(i).getRate() > rated1) {
				rated2 = rated1;
				rated3 = rated2;
				rated1 = i;
			} else if (movies.get(i).getRate() > rated2) {
				rated3 = rated2;
				rated2 = i;
			} else if (movies.get(i).getRate() > rated3) {
				rated3 = i;
			}
		}
		List<Movies> listMovies = null;
		listMovies.add(movies.get(rated1));
		listMovies.add(movies.get(rated2));
		listMovies.add(movies.get(rated3));
		return listMovies;
	}*/
	
	
}
