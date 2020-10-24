package com.satya.java8.practice;

import java.util.function.Function;



// 
public class FunctionInterface {

	                        public static void main(String[] args) {
							
	                        	Function<Integer,String> func=   a ->{ 
								return String.valueOf(a +2  ) ;
								};
								//System.out.println(func.apply(2)); ;
								
								// before  apply  it will execute  
								func =func.compose(a-> a*3) ;
								
								// after  apply  it will execute  this  a is  String
								func =func.andThen(a-> String.valueOf(new Integer (a) * 3)  ) ;
								
								//  
								System.out.println(func.apply(2)); ; 
								
								 // here 2 is passed , by composing it becomes 6  then  2 is added by the function itself . 
								 // Now it it 8 then andThen converts it to 24
								
						}
	
	
	
	
}
