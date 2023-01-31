package com.bridgelabs.modeanalyzer;

public class MoodAnalyzer
{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
public String analyseMood()
{
	try
	{
		if(message.toLowerCase().contains("happy"))
		{
			return "Happy";
		}else if(message.toLowerCase().contains("sad"))
		{
			return "Sad";
			
		}else
		{
			return "Any";
		}
	}catch(NullPointerException e)
	{
		return "Happy";
	}
}
	
}

