package com.emrecan.moviesRestApi.DataAccess;

import java.util.List;

import com.emrecan.moviesRestApi.Entity.Movie;

public interface IMovieDal {
	
	List<Movie> getAll();
	void add(Movie movie);
	void update(Movie movie);
	void delete(Movie movie);
	Movie getById(int id);

}
