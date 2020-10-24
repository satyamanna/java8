package com.satya.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



//  stream  is  used for  processing the collection of object ,
//  it takes input from  collection  i.e list
//  in this class  we have used map function using stream 
public class StreamMapFunc {

	
	 public static void main(String[] args) {
		
		 
	}
	 
	 
	 void test() {
		 List<String> list = new ArrayList<String>();
		 list.add("1"); 
		 list.add("2");
		 //  ::  is used for method reference 
		 list.stream().map(Tests::displayString).collect(Collectors.toList()).forEach(p->{
			 System.out.println(" "+p);
		 });
		 list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
	 }
}


final class  Tests{
	
	static String displayString(String s) {
		return  s ;
	}
}
