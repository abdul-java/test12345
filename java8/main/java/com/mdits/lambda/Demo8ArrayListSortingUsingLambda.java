package com.mdits.lambda;

import java.util.*; 
  
public class Demo8ArrayListSortingUsingLambda {
    public static void main(String[] args) 
    { 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(143); 
        al.add(105); 
        al.add(98); 
        al.add(245); 
        al.add(223); 
        System.out.println("Elements of the ArrayList " +  
                              "before sorting : " + al); 
  
        // using lambda expression in place of comparator object 
        Collections.sort(al, (obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0); 
  
        System.out.println("Elements of the ArrayList after" +  
                                           " sorting : " + al); 
    } 
} 

