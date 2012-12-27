package com.hashedin.huProject;

import java.util.List;
import java.util.Map;

public interface MovieRecommenderDBInterface {
	
	public Map<Integer,Movie> getMovieMap();
	
	public Map<Integer,User> getUserMap();
	
	public List<Rating> getRatingList();
}
