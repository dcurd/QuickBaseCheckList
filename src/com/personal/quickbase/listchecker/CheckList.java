package com.personal.quickbase.listchecker;

import java.util.List;

import com.personal.quickbase.listchecker.objects.LargestIntegers;

public class CheckList {

	public CheckList() {
	}
	
	
	
	// checks list and throws exception if less than two items in list
	/**
	 * 
	 * 
	 * @param list
	 * @return
	 */
	public LargestIntegers check(List<Integer> list){
		if(list.size()<2){
			throw new IllegalArgumentException("List has less than two (2) integers");
		}
		return checkList(list);
	}
	
	/**
	 * 
	 * 
	 * @param list
	 * @return
	 */
	//begin  check and continues sort if size is greater than 2
	private LargestIntegers checkList(List<Integer> list){
		LargestIntegers obj = new LargestIntegers();
		intilizeCheck(obj,list);
		if(list.size()>2){
			sortMyList(obj,list);
		}
		return obj;
	}
	
	/**
	 * 
	 * 
	 * @param list
	 * @return
	 */
	//sets first two integers as first and second largest in Largest Integers object
	private void intilizeCheck(LargestIntegers obj, List<Integer> list){
		if(list.get(0)>list.get(1)){
			obj.setFirstLargestInteger(list.get(0));
			obj.setSecondLargestInteger(list.get(1));
		}else{
			obj.setFirstLargestInteger(list.get(1));
			obj.setSecondLargestInteger(list.get(0));
		}
	}
	
	/**
	 * 
	 * 
	 * @param list
	 * @return
	 */
	//sorts list
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
