package com.satya.java8.practice;

import java.util.ArrayList;
import java.util.List;

public class LmdaForEach_Stream {

	public static void main(String[] args) {
		
		Product  product = new Product();
		product.setProductName("abcd");
		product.setProductPrice("10");
		
		Product  product1 = new Product();
		product1.setProductName("abcd1111");
		product1.setProductPrice("10");
		
		List<Product> list = new ArrayList<Product>() ;
		list.add(product);
		list.add(product1);

		list.forEach( p-> {
			System.out.println(p.getProductName());
		});
		
		list.stream().filter(p -> p.equals("abcd")).forEach(p->{
			System.out.println(p.getProductPrice());
		});

	}
	

}

class Product {
	
	private  String productName ; 
	private  String productPrice ;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	} 
	
	
}