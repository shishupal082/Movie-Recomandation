package com.hashedin.huProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HardCodedDatabase implements MovieRecommenderDBInterface {

	@Override
	/**
	 * It craetes Hardcoded Map of Movie
	 */
	public Map<Integer, Movie> getMovieMap() {
		Map<Integer, Movie> movieMap = new HashMap<Integer, Movie>();

		ArrayList<Genre> listGen1 = new ArrayList<Genre>();
		listGen1.add(Genre.ACTION);
		listGen1.add(Genre.ANIMATION);
		
		Movie movie1 = new Movie(1, "Toy Story", "01 jan 1995",listGen1);

		ArrayList<Genre> listGen2 = new ArrayList<Genre>();
		listGen2.add(Genre.COMEDY);
		listGen2.add(Genre.ANIMATION);
		Movie movie2 = new Movie(2, "Golden Eye", "01 jan 1996",listGen2);

		ArrayList<Genre> listGen3 = new ArrayList<Genre>();
		listGen3.add(Genre.ACTION);
		listGen3.add(Genre.ANIMATION);
		Movie movie3 = new Movie(3, "Four Rooms","01 jan 1997", listGen3);

		movieMap.put(movie1.getMovieId(), movie1);
		movieMap.put(movie2.getMovieId(), movie2);
		movieMap.put(movie3.getMovieId(), movie3);

		return movieMap;
	}

	@Override
	/**
	 * It craetes Hardcoded Map of User
	 * 
	 */
	public Map<Integer, User> getUserMap() {
		Map<Integer, User> userMap = new HashMap<Integer, User>();
		User user1 = new User(1, 20, 'M',"Engineer");
		User user2 = new User(2, 20, 'M',"Teacher");
		User user3 = new User(3, 20, 'M',"Police");

		userMap.put(user1.getUserId(), user1);
		userMap.put(user2.getUserId(), user2);
		userMap.put(user3.getUserId(), user3);

		return userMap;
	}

	@Override
	/**
	 * It craetes Hardcoded List of Rating
	 */
	public List<Rating> getRatingList() {
		List<Rating> ratingList = new ArrayList<Rating>();
		Rating ratingObj1 = new Rating(1, 3, 2,1995);
		Rating ratingObj2 = new Rating(1, 2, 3,2000);
		Rating ratingObj3 = new Rating(2, 2, 5,2002);

		ratingList.add(ratingObj1);
		ratingList.add(ratingObj2);
		ratingList.add(ratingObj3);

		return ratingList;
	}
}
