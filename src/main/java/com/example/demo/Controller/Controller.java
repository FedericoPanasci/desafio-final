package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.Movies;
import Services.services;

@RequestMapping("api")
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class Controller {
	
	private services service;
	
	@Autowired
	public Controller(services service) {
		this.service = service;
	}
	@Autowired
	public JpaRepository<Movies, Integer> repo;
	
	
	
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
	/*
	
	
	@GetMapping("/topRate")
	public List<Movies> topMovies(){
		return service.topMovies();
	}
	
	@GetMapping("/topRate")
	public List<Movies> topRate() {
		return service.topRate();
	}*/
}
