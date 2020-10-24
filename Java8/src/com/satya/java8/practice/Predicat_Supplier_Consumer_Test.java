package com.satya.java8.practice;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicat_Supplier_Consumer_Test {

	public static void main(String[] args) {
		
		//takes one parameter returns true false , test is default function
		Predicate<String> predicate = (st) -> {
			if(st.equalsIgnoreCase("mona")) 
				return true; 
			else  return false ;
		};
		
		System.out.println(predicate.test("satya"));
		
		
		
		// takes zero parameter returns a string/integer/boolean , get is default function
		Supplier<String>  supplier  =  () -> { return  "hello"; }; 
		System.out.println(supplier.get());
		
		
		
		// takes one parameter returns nothing , accept is default function
		Consumer<String> consume  =  (str) ->   {
			System.out.println("Hello " + str);
		} ; 
		
		consume.accept("Satya");
		
	}
	
	

	
	
	

}
