
import com.example.demo.ProjectMoviesApplication;

import Models.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(ProjectMoviesApplication.class, args);
    }
    @GetMapping
    public List<Movies> hello(){
        return List.of(
                new Movies(1, "Iron Man", 2015, "Martin Scorccese",
                     "Accion", "Iron Man es la historia del industrial multimillonario y genio inventor Tony ignora las exigencias de sus captores y utiliza su intelecto y su ingenio para crear una armadura que lo mantenga con vida y le permita escapar de su cautiverio.",
                        "https://static.wikia.nocookie.net/marveldatabase/images/2/20/Ironmanposter.jpg/revision/latest?cb=20080502172105",
                      "+13", 4, 4.5
                )
        );
    }
    @PostMapping
    public List<Movies> add(){
    	return List.of(
    			new Movies(
    						2, "Avengers", 2018, "Martin Scorccese", "Accion", "Los vengadores versus goku", 
    						"https://static.wikia.nocookie.net/marveldatabase/images/2/20/Ironmanposter.jpg/revision/latest?cb=20080502172105", 
    						"+13", 4, 4.5
    					)
    			);
    }
    @DeleteMapping
    public List<Movies> delete(Movies movie){
    	Number index = movie.indexOf
    }
    
}