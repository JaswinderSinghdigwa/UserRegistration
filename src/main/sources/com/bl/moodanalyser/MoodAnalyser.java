package com.bl.moodanalyser;

/**
 * Purpose  - Mood Analyser for user
 * @author  - Jaswinder Singh
 * @version - 16.0
 * @since   - 04-10-2021
 */

public class MoodAnalyser {

    public static  String analyseMood(String moodanalyser) throws MoodAnalyserException {
    	try {
            if (moodanalyser.length() == 0) {
                throw new MoodAnalyserException("Invalid Input");
            } else if (moodanalyser.toLowerCase().contains("happy")) {
                return "Entry Successful";
            } else if (moodanalyser.toLowerCase().contains("sad")) {
                return "Entry Failed";
            } else {
                return "Invalid Input";
            }
        } catch (MoodAnalyserException e) {
            throw new MoodAnalyserException("Invalid mood");
        }
    }
}