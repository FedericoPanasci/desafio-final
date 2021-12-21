import com.example.demo.ProjectMoviesApplication;

import Models.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
        SpringApplication.run(ProjectMoviesApplication.class, args);
    }
}

