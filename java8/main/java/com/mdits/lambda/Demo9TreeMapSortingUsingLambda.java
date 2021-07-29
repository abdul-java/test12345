package com.mdits.lambda;

import java.util.TreeMap;

public class Demo9TreeMapSortingUsingLambda {

	 public static void main(String[] args) 
	    { 
	        TreeMap<Integer, String> tm =  
	                   new TreeMap<Integer, String>();
	        
	        tm.put(1, "Apple"); 
	        tm.put(4, "Mango"); 
	        tm.put(5, "Kiwi"); 
	        tm.put(2, "Banana"); 
	        tm.put(3, "Papaya"); 
	        
	        System.out.println("Elements of the TreeMap " +  
                    "before sorting are : " + tm); 
	        
	        TreeMap<Integer, String> tm1 =  
	                   new TreeMap<Integer, String>((obj1, obj2) -> (obj1 > obj2) ?  
                                       -1 : (obj1 < obj2) ? 1 : 0); 
	        
	        tm1.putAll(tm);
	        System.out.println("Elements of the TreeMap " +  
	                             "after sorting are : " + tm1); 
	    } 
	} 
