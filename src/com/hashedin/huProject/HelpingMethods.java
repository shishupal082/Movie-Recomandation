package com.hashedin.huProject;

import java.util.ArrayList;
import java.util.Iterator;

public class HelpingMethods {
	
	public double avgListValue(ArrayList<Integer> givenList){
		float avg = 0;
		int totalRatingSum = 0;
		int givenListSize = givenList.size();
		Iterator<Integer> givenListIterator = givenList.iterator();
		while(givenListIterator.hasNext())
		{
			totalRatingSum = totalRatingSum + givenListIterator.next();
		}
		avg = totalRatingSum / givenListSize;
		return avg;
	}

}
