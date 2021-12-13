package Models;

public class Movies {
	private Integer id;
	private String title;
	private Integer year;
	private String director;
	private String gender;
	private String description;
	private String plot;
	private String classified;
	private Integer rate;
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
	
	
}
