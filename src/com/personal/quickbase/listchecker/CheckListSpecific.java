package com.personal.quickbase.listchecker;

import java.util.ArrayList;
import java.util.List;

import com.personal.quickbase.listchecker.objects.LargestIntegersSpecific;

public class CheckListSpecific {

	CheckList checkList=new CheckList();
	public CheckListSpecific() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Checks the specific implementations of { 5,100,10,125,15,150,20,175,25,0 } and
	 * { 25,93,97,18,71,114,52,48 } with CheckList functionality
	 * 
	 * 
	 * @return LargestIntegersSpecific POJO that contains the LargestIntegers POJO for
	 * both lists
	 */
	
		public LargestIntegersSpecific checkSpecificImplementation(){
			LargestIntegersSpecific largestIntegersSpecific = new LargestIntegersSpecific();
			List<Integer> firstList=createFirstList();
			List<Integer> secondList=createSecondList();
			largestIntegersSpecific.setFirstListLargestIntegers(checkList.check(firstList));
			largestIntegersSpecific.setSecondListLargestIntegers(checkList.check(secondList));
			return largestIntegersSpecific;
		}
		
		/**
		 * Creates first list of { 5,100,10,125,15,150,20,175,25,0 }
		 * 
		 * @param list
		 * @return List of { 5,100,10,125,15,150,20,175,25,0 }
		 */
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
		
		/**
		 * Creates second list of { 25,93,97,18,71,114,52,48 } 
		 * 
		 * @param list
		 * @return List of { 25,93,97,18,71,114,52,48 } 
		 */
		
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
