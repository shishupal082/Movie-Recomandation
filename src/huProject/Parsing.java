package huProject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parsing {

	public int getGenreId() {
		int genreId = 0;
		System.out.println("Enter genreId");
		Scanner in = new Scanner(System.in);
		genreId = in.nextInt();
		return genreId;
	}

	public Map<Integer, Movie> getMovieData() {
		Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();

		int genreArray1[] = { 1, 0, 0, 1 };
		Movie movie1 = new Movie(1, "Toy Story", "1-jan-1995", genreArray1);
		movieData.put(movie1.getMovieId(), movie1);

		int genreArray2[] = { 1, 1, 0, 1 };
		Movie movie2 = new Movie(2, "Golden Eye", "1995", genreArray2);
		movieData.put(movie2.getMovieId(), movie2);

		int genreArray3[] = { 1, 0, 0, 1 };
		Movie movie3 = new Movie(3, "Four Rooms", "1-jan-1995", genreArray3);
		movieData.put(movie3.getMovieId(), movie3);

		return movieData;
	}

	public List<Integer> getMovieIdList(Integer genreId) {

		ArrayList<Integer> movieIdList = new ArrayList<Integer>();

		Parsing objParser = new Parsing();
		Map<Integer, Movie> movieData = objParser.getMovieData();

		for (Movie k : movieData.values()) {
			if (k.getGenre()[genreId] == 1) {
				// System.out.println(k.getGenre()[genreId]);
				movieIdList.add(k.getMovieId());
			}
		}
		return movieIdList;
	}
}
