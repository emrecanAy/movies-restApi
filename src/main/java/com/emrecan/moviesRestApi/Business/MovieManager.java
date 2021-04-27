package com.emrecan.moviesRestApi.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emrecan.moviesRestApi.DataAccess.IMovieDal;
import com.emrecan.moviesRestApi.Entity.Movie;

@Service
public class MovieManager implements IMovieService {

	//You can add your business conditions to this methods.
	
	private IMovieDal movieDal;
	
	@Autowired
	public MovieManager(IMovieDal movieDal) {
		this.movieDal = movieDal;
	}
	

	@Override
	@Transactional
	public List<Movie> getAll() {
		return movieDal.getAll();
	}

	@Override
	@Transactional
	public void add(Movie movie) {
		movieDal.add(movie);
		
	}

	@Override
	@Transactional
	public void update(Movie movie) {
		movieDal.update(movie);
		
	}

	@Override
	@Transactional
	public void delete(Movie movie) {
		movieDal.delete(movie);
		
	}

	@Override
	@Transactional
	public Movie getById(int id) {
		return movieDal.getById(id);
	}

	
	
}
