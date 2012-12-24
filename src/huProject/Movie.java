package huProject;
import java.util.Arrays;


public class Movie {
	
	private int movieId;
	private String movieTitle;
	private String releaseDate;
	private int[] genre;
	
	public Movie(int movieId, String movieTitle, String releaseDate, int[] genre) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle
				+ ", releaseDate=" + releaseDate + ", genre="
				+ Arrays.toString(genre) + "]";
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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int[] getGenre() {
		return genre;
	}

	public void setGenre(int[] genre) {
		this.genre = genre;
	}
	
	
}
