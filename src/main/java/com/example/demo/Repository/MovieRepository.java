package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Models.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer> {
	@Query("SELECT m FROM Movies m WHERE m.title LIKE %:title%")
	List<Movies> findByTitle(@Param("title")String title);

	
	@Query ("SELECT p FROM Movies m ORDER BY p.rate DESC")
	List<Movies> filterPopular(PageRequest pageRequest);

	@Query("SELECT p FROM Movies m WHERE m.classified LIKE 'ATP'")
	List<Movies> findATP();
	
	
}
