package com.hashedin.huProject;

import java.util.List;

public class Main {

	public static void main(String args[])
	{
		MovieRecommenderDBInterface db = new HardCodedDatabase();
		MovieBuff movieBuffObj = new MovieBuff(db);
		
		//System.out.println(movieBuffuffObj.getMostWatchedMovieName());
		List<Integer>  movieIdListByGenre= movieBuffObj.getMovieIdListByGenre();
		System.out.println(movieBuffObj.getTopMovieRatingName(movieIdListByGenre));
		
	}
}
