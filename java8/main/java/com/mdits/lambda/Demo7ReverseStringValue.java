package com.mdits.lambda;

@FunctionalInterface
interface MyFunction {

    // abstract method
    String reverse(String n);
}

public class Demo7ReverseStringValue {

    public static void main( String[] args ) {

        // declare a reference to MyFunction
        // assign a lambda expression to the reference
    	MyFunction ref = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }

}
