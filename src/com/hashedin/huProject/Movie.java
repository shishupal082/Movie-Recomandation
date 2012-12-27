package com.hashedin.huProject;

import java.util.ArrayList;

public class Movie {

	private int movieId;
	private String movieTitle;
	private String date;

	private ArrayList<Genre> genreobj;

	@Override
	public String toString() {
		return "movieId= " + movieId + ", movieTitle= " + movieTitle
				+ ", date= " + date + ", genre= " + genreobj;
	}

	public Movie(int movieId, String movieTitle, String date,
			ArrayList<Genre> genreobj) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.date = date;
		this.genreobj = genreobj;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Genre> getGenreobj() {
		return genreobj;
	}

	public void setGenreobj(ArrayList<Genre> genreobj) {
		this.genreobj = genreobj;
	}
}
