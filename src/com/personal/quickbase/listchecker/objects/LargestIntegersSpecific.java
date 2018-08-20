package com.personal.quickbase.listchecker.objects;

public class LargestIntegersSpecific {

	/*
	 * POJO for specific lists listed in exercise
	 */
	LargestIntegers firstListLargestIntegers = new LargestIntegers();
	LargestIntegers secondListLargestIntegers = new LargestIntegers();
	public LargestIntegersSpecific() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setFirstListLargestIntegers(LargestIntegers firstListLargestIntegers){
		this.firstListLargestIntegers=firstListLargestIntegers;
	}
	
	public LargestIntegers getFirstListLargestIntegers(){
		return this.firstListLargestIntegers;
	}
	
	public void setSecondListLargestIntegers(LargestIntegers secondListLargestIntegers){
		this.secondListLargestIntegers=secondListLargestIntegers;
	}

	public LargestIntegers getSecondListLargestIntegers(){
		return this.secondListLargestIntegers;
	}
	

}
