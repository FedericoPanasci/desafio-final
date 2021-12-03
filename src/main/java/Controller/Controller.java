package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.Movies;

@RequestMapping
@RestController
public class Controller {
	private Controller control;
	private Service service;
	
	@Autowired
	public Controller(Service service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public List<Movies> getMovies(){
		return service.getMovies();
	}
	
	@PostMapping("/addMovie")
	public Movies createMovie(@RequestBody Movies movie) {
		return service.createMovie();
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
