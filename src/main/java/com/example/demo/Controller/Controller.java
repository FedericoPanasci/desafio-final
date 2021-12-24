package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Movies;
import com.example.demo.Services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	private final services service;
	
	@Autowired
	public Controller(services service) {
		this.service = service;
	}	
	
	@GetMapping("/")
	public List<Movies> getMovies(){
		return service.getMovies();
		
	}
	
	@PostMapping("/addMovie")
	public Movies createMovie(@RequestBody Movies movie) {
		return service.createMovie(movie);
	}
	
	@DeleteMapping("/deleteMovie")
	public void deleteMovie(@PathVariable Integer id) {
		service.deleteById(id);
	}
	
	@PutMapping("/updateMovie/{id}")
	public Movies updateMovie(@RequestBody Movies movie, @PathVariable Integer id) throws Exception{
		try {
			return service.updateMovie(movie, id);			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return movie;
	}
	
	@GetMapping("/searchId/{id}")
	public Optional<Movies> findId(@PathVariable Integer id) {
		return service.findId(id);
	}
	
	@GetMapping("/searchTitle/{title}")
	public List<Movies> findTitle(@PathVariable String title) {
		return service.findTitle(title);
	}

	@GetMapping("/topRate")
	public List<Movies> topMovies(){
		return service.topMovies();
	}
	
	@GetMapping("/ATP")
	public List<Movies> findClassified(@PathVariable String classified) {
		return service.findClassified(classified);
	}
}
