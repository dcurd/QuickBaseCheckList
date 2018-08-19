package com.personal.test.listchecker;

import java.util.ArrayList;
import java.util.List;

import com.personal.test.listchecker.objects.LargestIntegers;
import com.personal.test.listchecker.objects.LargestIntegersSpecific;

public class CheckList {

	public CheckList() {
		// TODO Auto-generated constructor stub
	}
	
	// add in this specific implementation due to the instructions being somewhat unclear
	// Wanted to be safe
	public LargestIntegersSpecific checkSpecificImplementation(){
		LargestIntegersSpecific largestIntegersSpecific = new LargestIntegersSpecific();
		List<Integer> firstList=createFirstList();
		List<Integer> secondList=createSecondList();
		largestIntegersSpecific.setFirstListLargestIntegers(check(firstList));
		largestIntegersSpecific.setSecondListLargestIntegers(check(secondList));
		return largestIntegersSpecific;
	}
	
	// checks list and throws exception if less than two items in list
	public LargestIntegers check(List<Integer> list){
		if(list.size()<2){
			throw new IllegalArgumentException("List has less than two (2) integers");
		}
		return checkList(list);
	}
	
	//begin  check and continues sort if size is greater than 2
	private LargestIntegers checkList(List<Integer> list){
		LargestIntegers obj = new LargestIntegers();
		intilizeCheck(obj,list);
		if(list.size()>2){
			sortMyList(obj,list);
		}
		return obj;
	}
	
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
	
	private List<Integer> createFirstList(){
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(5);
		firstList.add(100);
		firstList.add(10);
		firstList.add(125);
		firstList.add(15);
		firstList.add(150);
		firstList.add(20);
		firstList.add(175);
		firstList.add(25);
		firstList.add(0);
		return firstList;
	}
	
	private List<Integer> createSecondList(){
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(25);
		secondList.add(93);
		secondList.add(97);
		secondList.add(18);
		secondList.add(71);
		secondList.add(114);
		secondList.add(52);
		secondList.add(48);
		return secondList;
	}
}
