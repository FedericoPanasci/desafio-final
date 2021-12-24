package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Models.Movies;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {
	@Query("SELECT movie FROM Movies movie WHERE movie.title LIKE %:title%")
	List<Movies> findByTitle(@Param("title")String title);

	@Query ("SELECT p FROM Movies p ORDER BY p.rate DESC")
	List<Movies> filterPopular(PageRequest pageRequest);

	@Query ("SELECT p FROM Movies p WHERE p.classified LIKE %:classified%")
	List<Movies> filterClassified(@Param("classified") String classified);
}
