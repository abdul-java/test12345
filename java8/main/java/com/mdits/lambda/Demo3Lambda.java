package com.mdits.lambda;

interface StringConcat {

    public String concat(String a, String b);
    
}

public class Demo3Lambda{

   public static void main(String args[])
   {
        // lambda expression with multiple arguments
    	StringConcat str = (str1, str2) -> str1 + str2;
   
    	System.out.println("Result :" + str.concat("Lambda ", "Expression "));
   
   }
}



