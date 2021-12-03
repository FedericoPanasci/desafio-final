

public class Movies {
	String Titulo;
	Integer Anio;
	String Director;
	String Genero;
	String Resumen;
	String Poser;
	String Clasificacion;
	double Puntuacion;
	double duracion;
	
	public Movies() {
		
	}
	
	public Movies(String titulo, Integer anio, String director, String genero, String resumen, String poser,
			String clasificacion, double puntuacion, double duracion) {
		super();
		Titulo = titulo;
		Anio = anio;
		Director = director;
		Genero = genero;
		Resumen = resumen;
		Poser = poser;
		Clasificacion = clasificacion;
		Puntuacion = puntuacion;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Integer getAnio() {
		return Anio;
	}

	public void setAnio(Integer anio) {
		Anio = anio;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getResumen() {
		return Resumen;
	}

	public void setResumen(String resumen) {
		Resumen = resumen;
	}

	public String getPoser() {
		return Poser;
	}

	public void setPoser(String poser) {
		Poser = poser;
	}

	public String getClasificacion() {
		return Clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		Clasificacion = clasificacion;
	}

	public double getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		Puntuacion = puntuacion;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	
}
