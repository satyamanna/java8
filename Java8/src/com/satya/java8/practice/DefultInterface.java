package com.satya.java8.practice;

public class DefultInterface {

	 public static void main(String[] args) {
		// DefaultIT1 obj   =  new ABC() ; 
		 System.out.println(DefaultIT2.display1());;
		 System.out.println(new ABC().display());
	}
	  
}

// default method can  be override 
interface DefaultIT1{
	default  public String   display () {
		return "Copyright  @2020" ;
	}
	
	
}

interface DefaultIT2{
	default  public String   display () {
		return "Copyright  @2021" ;
	}
	static  public String   display1 () {
		return "Copyright  @2022" ;
	}
}


class ABC  implements  DefaultIT1,DefaultIT2 { 
	
	@Override
	public String   display () {
		return "Copyright  @2023"  ;
	}
	
	
}