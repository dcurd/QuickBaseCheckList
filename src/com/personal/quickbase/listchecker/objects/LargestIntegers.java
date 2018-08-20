package com.personal.quickbase.listchecker.objects;

public class LargestIntegers {

	/*
	 * POJO for a list's largest and second largest integers
	 */
	Integer firstLargestInteger=0;
	Integer secondLargestInteger=0;
	public LargestIntegers() {
		// TODO Auto-generated constructor stub
	}
	
	public void setFirstLargestInteger(Integer firstLargestInteger){
		this.firstLargestInteger=firstLargestInteger;
	}
	
	public Integer getFirstLargestInteger(){
		return this.firstLargestInteger;
	}
	
	public void setSecondLargestInteger(Integer secondLargestInteger){
		this.secondLargestInteger=secondLargestInteger;
	}

	public Integer getSecondLargestInteger(){
		return this.secondLargestInteger;
	}
}
