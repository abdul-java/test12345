package com.mdits.datetime;

import java.time.LocalDate;

public class Demo5DateTime {

	public static void main(String[] args) {
		
	// To find which year is the Leap Year 
 
	        LocalDate date1 = LocalDate.of(2024, 1, 13);  
	        System.out.println(date1.isLeapYear());  
	        
	        LocalDate date2 = LocalDate.of(2020, 9, 23);  
	        System.out.println(date2.isLeapYear());  
	      }  
	      
	}


