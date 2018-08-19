package com.personal.quickbase.listchecker;

import java.util.ArrayList;
import java.util.List;

import com.personal.quickbase.listchecker.objects.LargestIntegersSpecific;

public class CheckListSpecific {

	CheckList checkList=new CheckList();
	public CheckListSpecific() {
		// TODO Auto-generated constructor stub
	}
	
	// add in this specific implementation due to the instructions being somewhat unclear
		// Wanted to be safe
		public LargestIntegersSpecific checkSpecificImplementation(){
			LargestIntegersSpecific largestIntegersSpecific = new LargestIntegersSpecific();
			List<Integer> firstList=createFirstList();
			List<Integer> secondList=createSecondList();
			largestIntegersSpecific.setFirstListLargestIntegers(checkList.check(firstList));
			largestIntegersSpecific.setSecondListLargestIntegers(checkList.check(secondList));
			return largestIntegersSpecific;
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
