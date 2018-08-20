package com.personal.quickbase.listchecker;

import java.util.List;

import com.personal.quickbase.listchecker.objects.LargestIntegers;

public class CheckList {

	public CheckList() {
	}
	
	
	/**
	 * Iterates through a List to retrieve first and second largest integer
	 * Throws Illegal Argument Exception is size of list is less than two
	 * 
	 * @param List<Integer> list
	 * @return LargestIntegers POJO for the list's two largest integers
	 */
	public LargestIntegers check(List<Integer> list){
		if(list.size()<2){
			throw new IllegalArgumentException("List has less than two (2) integers");
		}
		return checkList(list);
	}
	
	/**
	 * Creates LargestIntegers POJO, calls initlizeCheck method to initialize the first and
	 * second largest integers, continues sorting of list if size is greater than two
	 * 
	 * @param List<Integer> list
	 * @return LargestIntegers POJO
	 */
	
	private LargestIntegers checkList(List<Integer> list){
		LargestIntegers obj = new LargestIntegers();
		initializeCheck(obj,list);
		if(list.size()>2){
			sortMyList(obj,list);
		}
		return obj;
	}
	
	/**
	 * Initializes the checking of the list by sorting the first two integers by relation to one another
	 * 
	 * @param LargestIntegers obj, List<Integer> list
	 * 
	 */
	
	private void initializeCheck(LargestIntegers obj, List<Integer> list){
		if(list.get(0)>list.get(1)){
			obj.setFirstLargestInteger(list.get(0));
			obj.setSecondLargestInteger(list.get(1));
		}else{
			obj.setFirstLargestInteger(list.get(1));
			obj.setSecondLargestInteger(list.get(0));
		}
	}
	
	/**
	 * Sort through list starting at third element, if Integer is largest than largest Integer
	 * in POJO, than will set FirstLargest to SecondLargest and FirstLargest to current element in list.
	 * Otherwise, if current Integer is smaller than the FirstLargest Integer but greater than 
	 * SecondLargest, set SecondLargest to current element.
	 * 
	 * @param LargestIntegers obj, List<Integer> list
	 * 
	 */
	
	private void sortMyList(LargestIntegers obj,List<Integer> list){
		for(int i=2; i<list.size();i++){
			if(list.get(i)>obj.getFirstLargestInteger()){
				obj.setSecondLargestInteger(obj.getFirstLargestInteger());
				obj.setFirstLargestInteger(list.get(i));
			}else if(list.get(i)<obj.getFirstLargestInteger()&&list.get(i)>obj.getSecondLargestInteger()){
				obj.setSecondLargestInteger(list.get(i));
			}
		}
	}
	
	
}
