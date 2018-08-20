package com.personal.quickbase.listchecker;

import static org.junit.Assert.*;

import org.junit.Test;

import com.personal.quickbase.listchecker.objects.LargestIntegersSpecific;

public class CheckListSpecificTest {

	/*
	 * tests for specific implementation of two lists as defined by the exercise.
	 * First List:{ 5,100,10,125,15,150,20,175,25,0 } 
	 * Second List:{ 25,93,97,18,71,114,52,48 }
	 */
	@Test
	public void testCheckSpecificImplementation() {
			CheckListSpecific checkList=new CheckListSpecific();
			LargestIntegersSpecific largestIntegersSpecific=checkList.checkSpecificImplementation();
			assertEquals(largestIntegersSpecific.getFirstListLargestIntegers().getFirstLargestInteger()
					,Integer.valueOf(175));
			assertEquals(largestIntegersSpecific.getFirstListLargestIntegers().getSecondLargestInteger()
					,Integer.valueOf(150));
			assertEquals(largestIntegersSpecific.getSecondListLargestIntegers().getFirstLargestInteger()
					,Integer.valueOf(114));
			assertEquals(largestIntegersSpecific.getSecondListLargestIntegers().getSecondLargestInteger()
					,Integer.valueOf(97));
		
	}

}
