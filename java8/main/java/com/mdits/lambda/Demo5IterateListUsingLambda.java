package com.mdits.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo5IterateListUsingLambda 
{
	public static void main(String[] argv) 
	{
	List<String> names = new ArrayList<>();
		names.add("Jack");
		names.add("Ben");
		names.add("Adam");
		names.add("Sid");
		names.add("Tom");
		
		//  Iterate without using Lambda
		 Iterator<String> iterator = names.iterator();
		 
		 while (iterator.hasNext()) {
			System.out.println(iterator.next());
		 } 
		 
		//  Iterate with using Lambda
	//	names.forEach(name->System.out.println(name));
		 
	}
}