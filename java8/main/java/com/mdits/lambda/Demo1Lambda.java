package com.mdits.lambda;

@FunctionalInterface
interface AddTwoNumber {

    public int addMethod(int a, int b);
   
}

@FunctionalInterface
interface AddString {

    public String addString();
   
}


public class Demo1Lambda {

   public static void main(String args[]) {
	   
        // lambda expression
	   AddTwoNumber sum = (a, b) -> a + b;
	 
	   AddString str = () -> "hello";
	   
	   System.out.println(str.addString());
       
	   System.out.println("Result: "+ sum.addMethod(60, 10));
    }
}
