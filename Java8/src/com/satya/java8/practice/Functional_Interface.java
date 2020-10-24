package com.satya.java8.practice;

public class Functional_Interface {

	public static void main(String[] args) {

		//  creating object  
		
		Functional_INTEFACE obj  =   (x,y) ->  {
			return x + y  ; 
			
			} ; 
		
		
			  
		//  calling the method  
		obj.sum(10, 20) ;
  		
	}

}

//  this is  functional interface which is defined as containing only  one abstract method
interface  Functional_INTEFACE{
	
	 int  sum  (int x,int  y) ;
	
	
}