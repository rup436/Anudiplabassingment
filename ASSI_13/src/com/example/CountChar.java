package com.example;

import java.util.HashMap;

public class CountChar //class
{

	public static void main(String[] args)
	{
	char[]arr= {'a','c','d','f','a'};
	
	//create a HashMap to store the char count
	HashMap <Character,Integer>charCounts = new HashMap<>();
	for(char p:arr) // for each loop
	{
		int count=charCounts.getOrDefault(p,0);
		charCounts.put(p, count+1);
	}
		for(char p:charCounts.keySet()) //for each loop
		{
			System.out.println(p+":"+charCounts.get(p));
		}
	}

}