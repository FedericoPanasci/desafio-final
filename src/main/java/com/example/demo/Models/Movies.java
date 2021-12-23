package com.example.demo.Models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies implements Comparable<Movies>, Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Integer id;
	@Column(name = "title", length = 40)
	private String title;
	@Column(name = "year")
	private Integer year;
	@Column(name = "director", length = 40)
	private String director;
	@Column(name = "gender", length = 40)
	private String gender;
	@Column(name = "description", length = 40)
	private String description;
	@Column(name = "plot", length = 400)
	private String plot;
	@Column(name = "classified", length = 40)
	private String classified;
	@Column(name = "rate")
	private Integer rate;
	@Column(name = "duration")
	private Double duration;
	
	public Movies(Integer id, String title, Integer year, String director, String gender, String description, String plot,
			String classified, Integer rate, Double duration) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.director = director;
		this.gender = gender;
		this.description = description;
		this.plot = plot;
		this.classified = classified;
		this.rate = rate;
		this.duration = duration;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Movies() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getClassified() {
		return classified;
	}

	public void setClassified(String classified) {
		this.classified = classified;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	
	@Override
	public int compareTo(Movies o) {
		return rate.compareTo(o.getRate());
	}
	
	
}
