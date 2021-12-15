package Services;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import org.springframework.stereotype.Service;

import Models.Movies;

@Service
public class services {
	public List<Movies> movies;
		
	public services(List<Movies> movie) {
		this.movies = movie;
	}
	
	public List<Movies> getMovie() {
		return movies;
	}

	public void setMovie(List<Movies> movie) {
		this.movies = movie;
	}

	public Movies createMovie(Movies movie) {
		movies.add(movie);
		return movie;
	}
	
	public boolean deleteMovie(Integer id) {
		for(Movies m: movies) {
			if(m.getId().equals(id)) {
				movies.remove(m);
				return true;
			}
		}
		return false;
	}
	
	public Movies updateMovie(Movies movie) {
		for(Movies m: movies) {
			if(m.getId().equals(movie.getId())) {
				movies.remove(m);
				movies.add(movie);
			}
		}
		return movie;
	}

	public Movies findId(Integer id) {
		return movies.stream().filter(m -> m.getId() == id).findAny().get();
		//Integer pos = -1;
		/*for(Integer i=0; i < movies.size(); i++) {
			if(movies.get(i).getId() == id) {
				pos = i;
			}
		}
		
		if(pos != -1) {
			aux = movies.get(pos);
		} else {
			aux = null;
		}*/
		//return (Movies) aux;
	}

	
	public Movies findTitle(String title) {
		return movies.stream().filter(m -> m.getTitle() == title).findAny().get();
	}

	public List<Movies> findClassified(String classified) {
		ArrayList<Movies> aux1 = new ArrayList<Movies>();
		for(Integer i = 0; i < movies.size(); i++) {
			if (movies.get(i).getClassified().equals(classified)) {
				aux1.add(movies.get(i));
			}
		}
		return aux1;
	}

	public List<Movies> compare (){
		List <Movies> aux = movies;
		Collections.sort(aux);
		return aux;//movies.sort((m1, m2) -> m1.getRate().getValue().compareTo(m2.getRate().getValue())).collect(Collectors.toList());
		//return movies.stream().sorted(Comparator.comparingInt(Movies.class::getRate)).findAny().get();
	}
	
	/*public List<Movies> topRate() {
		Integer rated1 = 0;
		Integer rated2 = 0;
		Integer rated3 = 0;
		for(Integer i = 0; i < movies.size(); i++) {
			if(movies.get(i).getRate() > rated1) {
				rated2 = rated1;
				rated3 = rated2;
				rated1 = i;
			} else if (movies.get(i).getRate() > rated2) {
				rated3 = rated2;
				rated2 = i;
			} else if (movies.get(i).getRate() > rated3) {
				rated3 = i;
			}
		}
		List<Movies> listMovies = null;
		listMovies.add(movies.get(rated1));
		listMovies.add(movies.get(rated2));
		listMovies.add(movies.get(rated3));
		return listMovies;
	}*/
	
	
}
