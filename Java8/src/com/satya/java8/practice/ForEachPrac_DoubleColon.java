package com.satya.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class  Base  {
	public String  display1(String s) {
		return  null ;
	}
}


public class ForEachPrac_DoubleColon extends Base{

	
	
	      static void  display (String s) {
	    	  System.out.println(s);
	      }
	      
	      static String  display2 (String s) {
	    	  //System.out.println(s);
	    	  return s;
	      }
	      Function <String,String>  func = super::display1 ;
	      Function <String,String>  func1 = ForEachPrac_DoubleColon::display2 ;
	      
		  public static void main(String[] args) {
			  Function <String,String>  func1 = ForEachPrac_DoubleColon::display2 ;
			  System.out.println(func1.apply("satya"));;
			  
			  
		    	  List<String> list = Arrays.asList("a" , "b" , "c") ; 
		    	  // double colon  operator 
		    	  list.forEach(ForEachPrac_DoubleColon :: display);
		    	  // in typical way of writing 
		    	  list.forEach( p ->   {
		    		  System.out.println(p);
		    	  });
		    	  
		    	  	
		    	  // we just converting it  
					/*
					 * p -> { System.out.println(p); })
					 *
					 *
					 */
		    	  
					/*
					 * TO
					 * 
					 * 
					 * static void display (String s) { System.out.println(s); }
					 */
		    	  
		    	  
		    	 
		  }
	      
	     
	      
	      
	      
	      
}



