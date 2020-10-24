package com.satya.java8.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorTest {

	 // need to know about stream.collect , Collectors.groupingBy, Collectors.collectingAndThen Collectors.maxBy 
	  public static void main(String[] args) {
		User user1  = new User("adam" ,  "101" ,  "napatty barowary tala", 10097l , 9087l,"type1") ;
		User user2  = new User("adam1" ,  "101" ,  "napatty barowary tala", 10097l , 9088l,"type1") ;
		User user3  = new User("adam2" ,  "101" ,  "napatty barowary tala", 10099l , 9089l,"type3") ;
		List<User> list = new ArrayList<User>() ; 
		list.add(user1);
		list.add(user2);
		list.add(user3);
		Collection<User>  lastupdate  =  list.stream().collect(Collectors.groupingBy(User::getEffectiveDate ,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(User::getTxnTime)), Optional::get))).values() ;
		//list.stream().collect(supplier, accumulator, combiner) -- 
		//list.stream().collect(collector)
		//Collectors.groupingBy(classifier, mapFactory, downstream) -- returns collectors
		
		for(User user :  lastupdate) {
			System.out.println(user.toString());
		}
	}
}



class  User {
	
	public User(String name, String id, String address, Long effectiveDate, long txnTime ,String trnType) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.effectiveDate = effectiveDate;
		this.txnTime = txnTime;
		this.transactionType = trnType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public long getTxnTime() {
		return txnTime;
	}
	public void setTxnTime(long txnTime) {
		this.txnTime = txnTime;
	}
	private String name;
	private String id;
	private String address;
	private Long effectiveDate;
	private long txnTime ;
	private String transactionType ;
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", address=" + address + ", effectiveDate=" + effectiveDate
				+ ", txnTime=" + txnTime + ", transactionType=" + transactionType + "]";
	}
	
	
	
}