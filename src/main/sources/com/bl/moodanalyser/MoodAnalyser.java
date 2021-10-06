package com.bl.moodanalyser;

/**
 * Purpose  - Mood Analyser for user
 * @author  - Jaswinder Singh
 * @version - 16.0
 * @since   - 04-10-2021
 */

public class MoodAnalyser {

    public static boolean analyseMood(String moodanalyser) {
    	try {
	    	if (moodanalyser.length() == 0) {
	    		throw new MoodAnalyserException("\nNull user input");
	    	}
	        if (moodanalyser.toLowerCase().contains("happy")) {
	            return true;
	        } else if (moodanalyser.toLowerCase().contains("sad")) {
	            return false;
	        } else return (Boolean) null;
    	}catch (MoodAnalyserException e) {
    		System.out.print(e.getMessage());
    	}
    	return false;
    }
}