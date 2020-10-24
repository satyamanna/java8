package com.satya.java8.test;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//  this class provides practice of predicate , supplier , Consumer which is the part of functional interface in JAVA 8 
//  predicate takes one parameter and returns true and false 
//  supplier  takes zero parameter and returns output 
//  consumer  takes one parameter and doesn't generate any output 

public class Predicate_Supplier_Consumer_Test {

	
	
	public static void main(String[] args) {
		// take one parameter  and return  value  with test function    
		Predicate<String> p  =  (st) ->  { 
			if(st.equalsIgnoreCase("Satya")) {
				return true ;
			}
			else {
				return false ;
			}
		} ;
		
		System.out.println(p.test("hhh") );
		//p.test("hhh") ;
		
		// supplier takes no argu  producs output
		Supplier<String > s  =  () ->  {
			return "asa" ;
		} ;
		
		System.out.println(s.get()) ;
		//  consumer accepts 
		Consumer<String> con  = (st)  ->  {
			if(st.equalsIgnoreCase("Satya")) {
				System.out.println("This is matched String");
			}
			else {
				System.out.println("This is not matched String");
			}
		} ;
		
		con.accept("mona");
	}
	
}
