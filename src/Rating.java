

public class Rating {

	private int userId;
	private int movieId;
	private int rating;
	private String timeStamp;

	public Rating(int userId, int movieId, int rating, String timeStamp) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", movieId=" + movieId
				+ ", rating=" + rating + ", timeStamp=" + timeStamp + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
