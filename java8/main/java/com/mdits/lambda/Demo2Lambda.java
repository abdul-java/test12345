package com.mdits.lambda;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface FunctionalInterfaceEx {
	public String saySomething();
}

public class Demo2Lambda {
	
//	@Override    // without Lambda 
//	public String saySomething() {
//
//		return "without lambda expresion ";
//	}

	public static void main(String args[]) {
		
//		Demo2Lambda dl = new Demo2Lambda();
//	System.out.println(dl.saySomething());

		// lambda expression
	 FunctionalInterfaceEx fi = () -> { return "With Lambda Exression"; };
		System.out.println(fi.saySomething());
			
	}

	}

