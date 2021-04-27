package com.emrecan.moviesRestApi.Entity;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Movie {
	
	@Id
	@Column(name="film_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private int releaseYear;
	
	@Column(name="language_id")
	private int languageId;
	
	/*
	 * @Column(name="original_language_id")
	 * private int originalLanguageId;
	 */
	
	@Column(name="rental_duration")
	private int rentalDuration;
	
	@Column(name="rental_rate")
	private String rentalRate;
	
	@Column(name="length")
	private int length;
	
	@Column(name="replacement_cost")
	private String replacementCost;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="special_features")
	private String specialFeatures;
	
	@Column(name="last_update")
	private String lastUpdate;
	
	public Movie(int id, String title, String description, int releaseYear, int languageId,
			int rentalDuration, String rentalRate, int length, String replacementCost, String rating,
			String specialFeatures, String lastUpdate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		/* this.originalLanguageId = originalLanguageId; */
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.lastUpdate = lastUpdate;
	}
	
	public Movie() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public String getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(String rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(String replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
	
	
	
	

}
