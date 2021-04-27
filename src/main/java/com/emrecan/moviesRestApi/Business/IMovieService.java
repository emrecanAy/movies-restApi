package com.emrecan.moviesRestApi.Business;

import java.util.List;

import com.emrecan.moviesRestApi.Entity.Movie;

public interface IMovieService {
	
	List<Movie> getAll();
	void add(Movie movie);
	void update(Movie movie);
	void delete(Movie movie);
	Movie getById(int id);

}
