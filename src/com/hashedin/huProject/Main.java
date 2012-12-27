package com.hashedin.huProject;

import java.util.List;

public class Main {

	/**
	 * 
	 * This is the main function where every Methods is being called
	 * Here Called Methods:-----
	 * 
	 * movieBuffObj.getMostWatchedMovieName();
	 * movieBuffObj.getTopMovieRatingName(movieIdListByGenre));
	 */
	public static void main(String args[])
	{
		MovieRecommenderDBInterface db = new HardCodedDatabase();
		MovieBuff movieBuffObj = new MovieBuff(db);
		
		System.out.println("Most Watched Movie\t"+movieBuffObj.getMostWatchedMovieName());
		List<Integer>  movieIdListByGenre= movieBuffObj.getMovieIdListByGenre();
		System.out.println("Top Movie By Genre\t"+movieBuffObj.getTopMovieRatingName(movieIdListByGenre));
		
	}
}
