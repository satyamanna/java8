package com.satya.java8.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prac_Lamda {

	
	  public static void main(String[] args) {
		
		 //  lamda  functions  are functional interface 
		  ABC  ob  = (x,y) ->  {
			return x+y;
		} ; 
		
		System.out.println("Using lamda function  "+ob.add(10, 60)); ; 
		
		
		
		//   stream  api  filter function
		List<String>  list 
		= new  ArrayList<String>() ; 
		list.add("abcd") ; 
		list.add("efgh") ; 
		
		System.out.println("without filter" );
		list.forEach(p->  {
			System.out.println(p);
		});
		System.out.println("With filter ");
		list.stream().filter(p ->  p.equalsIgnoreCase("abcd")).forEach(p-> {
			System.out.println(p);
		});
		
		
		//  stream api map function 
		
		List<String>  list1 = new  ArrayList<String>() ; 
		list1.add("abcd") ; 
		list1.add("efgh") ; 
		
		list1.stream().map(String::toUpperCase).collect(Collectors.toList()) ;
		
		
	}
}


interface ABC  {
	            int  add( int  x,int  y ) ;
}