package com.moodanalyzer.moodanalyzer;

public class Main {

	public static void main(String[] args) 
	{
		MoodAnalyzer moodanalyzer=new MoodAnalyzer();
		String mood=moodanalyzer.analyseMood("I am Happy");
		System.out.println(mood);
		mood=moodanalyzer.analyseMood("I an Sad");
		System.out.println(mood);

	}

}
