package com.hashedin.huProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MovieBuff {

	private MovieRecommenderDBInterface movieDb;

	public MovieBuff(MovieRecommenderDBInterface db) {
		this.movieDb = db;
	}
	
	public String getMostWatchedMovieName() {
		
		List<Rating> ratingListObj = new ArrayList<Rating>();
		
		ratingListObj = movieDb.getRatingList(); 
		
		Integer watchedCount [] = new Integer [8];

		System.out.println(ratingListObj.size());
		
		for(int t = 0 ; t < watchedCount.length ; t++){
			watchedCount[ t ] = 0;
		}
		System.out.println(watchedCount[0]);
		for(int t = 0 ; t < ratingListObj.size() ; t++){
			
			watchedCount [ ratingListObj.get(t).getMovieId() ] += 1; 
			
		}
		Integer mostWatchedMovie = 0;
		
		for(int t = 0 ; t < watchedCount.length; t++){
			
			if( watchedCount[t] > mostWatchedMovie ){
				
				mostWatchedMovie = t; 
			}
		}
		
		return movieDb.getMovieMap().get(mostWatchedMovie).getMovieTitle();
	}
	
	public List<Integer> getMovieIdListByGenre() {
		
		Scanner in1 = new Scanner(System.in);
		int genreInput;
		System.out.println("Enter genre ID e.g 0 1 2 3 \t");
		genreInput = in1.nextInt();
		
		Map<Integer,ArrayList<Integer>> movieUserMapByGenre = new HashMap<Integer,ArrayList<Integer>>();
		
		Map<Integer,Movie> movieMap = new HashMap<Integer,Movie>();
		List<Integer>movieIdListByGenre = new ArrayList<Integer>();
		movieMap = movieDb.getMovieMap();
		for(Movie k :movieMap.values())
		{
			Genre g = null;
			if(k.getGenreobj().contains(g.fromCode(genreInput)))
			{
				int movieId = k.getMovieId();
				movieIdListByGenre.add(movieId);
				System.out.println(movieId);
			}
		}
		return movieIdListByGenre;
	}
	
	public String getTopMovieRatingName(List<Integer> movieIdList) {
		List<Rating> ratingList = movieDb.getRatingList();
		int maxRatingMovieId = 0;
		float rate = 0,preRate = 0;
		int ratingVal = 0;
		int count = 0;
		for(Integer k:movieIdList)
		{
			for(Rating rating:ratingList)
			{
				if(k == rating.getMovieId())
				{
					count++;
					ratingVal = ratingVal + rating.getRating(); 
				}
			}
			rate = (float)ratingVal/count;
			if(rate > preRate)
			{
				maxRatingMovieId = k;
			}
			ratingVal = 0;
			count = 0;
		}
		return movieDb.getMovieMap().get(maxRatingMovieId).getMovieTitle();
	}
}
