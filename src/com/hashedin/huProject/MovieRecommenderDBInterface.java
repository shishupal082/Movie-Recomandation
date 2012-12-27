package com.hashedin.huProject;

import java.util.List;
import java.util.Map;
/**
 * @author shishupal
 * It is a Interface which helps to take Input data either from HardCode or File
 */
public interface MovieRecommenderDBInterface {
	
	public Map<Integer,Movie> getMovieMap();
	
	public Map<Integer,User> getUserMap();
	
	public List<Rating> getRatingList();
}
