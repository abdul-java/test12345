package com.mdits.lambda;

@FunctionalInterface
interface FunctionalEX {

	//A method with single parameter
	public int incrementByFive(int a);
}

public class Demo4Lambda {

	public static void main(String args[])
	{
		
		// lambda expression with single parameter num
		
		    FunctionalEX f = (num) -> num+5;
		
		System.out.println(f.incrementByFive(20));
		
	}
}
