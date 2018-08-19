package com.personal.quickbase.listchecker;

import static org.junit.Assert.*;

import org.junit.Test;

import com.personal.quickbase.listchecker.objects.LargestIntegersSpecific;

public class CheckListSpecificTest {

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
