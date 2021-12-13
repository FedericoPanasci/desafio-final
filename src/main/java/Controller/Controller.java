package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RequestMapping
@RestController
public class Controller {
	
	private services service;
	
	@Autowired
	public Controller(services service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public List<Movies> getMovies(){
		return service.getMovie();
	}
	
	@PostMapping("/addMovie")
	public Movies createMovie(@RequestBody Movies movie) {
		return service.createMovie(movie);
	}
	
	@DeleteMapping("/deleteMovie")
	public boolean deleteMovie(@PathVariable Integer id) {
		return service.deleteMovie(id);
		
	}
	
	@PutMapping("/updateMovie")
	public Movies updateMovie(Movies movie) {
		return service.updateMovie(movie);
	}
}
