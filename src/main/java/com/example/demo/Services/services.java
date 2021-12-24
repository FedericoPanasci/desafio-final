package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Movies;
import com.example.demo.Repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

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
		return movieRepository.filterClassified(classified);
	}	
}
