package com.emrecan.moviesRestApi.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emrecan.moviesRestApi.Entity.Movie;

@Repository
public class HibernateMovieDal implements IMovieDal {
	
	private EntityManager entityManager;

	@Autowired
	public HibernateMovieDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Movie> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Movie> movies = session.createQuery("from Movie", Movie.class).getResultList();
		return movies;
	}

	@Override
	@Transactional
	public void add(Movie movie) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(movie);
		
	}

	@Override
	@Transactional
	public void update(Movie movie) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(movie);
		
	}

	@Override
	@Transactional
	public void delete(Movie movie) {
		Session session = entityManager.unwrap(Session.class);
		Movie movieToDelete = session.get(Movie.class, movie.getId());
		session.delete(movieToDelete);
		
	}

	@Override
	@Transactional
	public Movie getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Movie movie = session.get(Movie.class, id);
		return movie;
	}
	
	

}
