package com.mdits.lambda;

import java.util.HashMap;
import java.util.Map;

public class Demo6IterateMapUsingLambda 
{
	public static void main(String[] args)
	{
		Map<String, Integer> prices = new HashMap<>();
		
		prices.put("Apple", 30);
		prices.put("Orange", 20);
		prices.put("KIWI", 10);
		prices.put("Grapes", 30);
		prices.put("Banana", 50);
		
		// Iterate without using Lambda
		 
		for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		 
		// Iterate with using Lambda
	//	 prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));

	}
}