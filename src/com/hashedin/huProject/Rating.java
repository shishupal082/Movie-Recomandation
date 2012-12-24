package com.hashedin.huProject;

public class Rating {
	/**
	 * userId, movieId, rating and timeStamp are the private variable
	 */
	private int userId;
	private int movieId;
	private int rating;
	private String timeStamp;
	
	/**
	 * Constructor to Initialise the variable
	 * @param userId = Contain User ID
	 * @param movieId = Contain  movie Id
	 * @param rating = Contain the movie rating
	 * @param timeStamp = Contain unknown String (for me)
	 */
	public Rating(int userId, int movieId, int rating, String timeStamp) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.timeStamp = timeStamp;
	}
	/**
	 * This improve the readability of output
	 */
	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", movieId=" + movieId
				+ ", rating=" + rating + ", timeStamp=" + timeStamp + "]";
	}
	/**
	 * @return userId = it return the userId contained in rating.data file
	 */
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return movieId = it return the movieId contained in rating.data file
	 */
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	/**
	 * @return rating = it return the rating contained in rating.data file
	 */
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return timeStamp = it return the timeStamp contained in rating.data file
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
