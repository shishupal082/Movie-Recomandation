
import java.util.Iterator;
import java.util.List;



public class MovieRecomand {

	public static void main(String args[]) {
		
		Parsing objParser = new Parsing();
		
		//getGenreId from user(KeyBoard)
		int genreId = 0;//objParser.getGenreId();
		
		//getMovieId list of this genreId
		List<Integer> movieIdList = objParser.getMovieIdList(genreId);
		Iterator<Integer> it = movieIdList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
