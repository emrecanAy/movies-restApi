package com.emrecan.moviesRestApi.restfulApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emrecan.moviesRestApi.Business.IMovieService;
import com.emrecan.moviesRestApi.Entity.Movie;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	private IMovieService movieService;
	
	@Autowired
	public MovieController(IMovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping("")
	public String sayWelcome() {
		return "Welcome to my Movie API";
	}
	
	@GetMapping("/movies")
	public List<Movie> get(){
		return this.movieService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Movie movie) {
		this.movieService.add(movie);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Movie movie) {
		this.movieService.update(movie);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Movie movie) {
		movieService.delete(movie);
	}
	
	@GetMapping("/movies/{id}")
	public Movie getById(@PathVariable int id) {
		return movieService.getById(id);
	}
	
	
	

}
