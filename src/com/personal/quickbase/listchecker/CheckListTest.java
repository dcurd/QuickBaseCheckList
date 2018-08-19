package com.personal.quickbase.listchecker;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.personal.quickbase.listchecker.objects.LargestIntegers;

public class CheckListTest {
	
	@Rule
	public final ExpectedException expectedException=ExpectedException.none();

	@Test
	public void testSizesNoIntegerArrayList() {
		List<Integer> testArrayList=new ArrayList<Integer>();
		CheckList checkList=new CheckList();
		
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testArrayList);
		
		
	}
	
	@Test
	public void testSizesOneIntegerArrayList() {
		List<Integer> testArrayList=new ArrayList<Integer>();
		CheckList checkList=new CheckList();
		
		testArrayList.add(5);
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testArrayList);
		
		
	}
	
	@Test
	public void testSizesNoIntegerLinkedList() {
		List<Integer> testLinkedList=new LinkedList<Integer>();
		CheckList checkList=new CheckList();
		
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testLinkedList);
		
		
	}
	
	@Test
	public void testSizesOneIntegerLinkedList() {
		List<Integer> testLinkedList=new LinkedList<Integer>();
		CheckList checkList=new CheckList();
		
		testLinkedList.add(5);
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testLinkedList);
		
	}
	
	@Test
	public void testSizesNoIntegerVector() {
		List<Integer> testVector=new Vector<Integer>();
		CheckList checkList=new CheckList();
		
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testVector);
		
	}
	
	
	@Test
	public void testSizesOneIntegerVector() {
		List<Integer> testVector=new Vector<Integer>();
		CheckList checkList=new CheckList();
		
		testVector.add(5);
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testVector);
		
	}
	
	
	@Test
	public void testSizesNoIntegerStack() {
		List<Integer> testStack=new Stack<Integer>();
		CheckList checkList=new CheckList();
		
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testStack);
		
	}
	
	@Test
	public void testSizesOneIntegerStack() {
		List<Integer> testStack=new Stack<Integer>();
		CheckList checkList=new CheckList();
	
		testStack.add(5);
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("List has less than two (2) integers");
		checkList.check(testStack);
	}
	
	@Test
	public void  testFirstListImplementationArrayList(){
		CheckList checkList=new CheckList();
		ArrayList<Integer> testArrayList=new ArrayList<Integer>();
		testArrayList.add(5);
		testArrayList.add(100);
		testArrayList.add(10);
		testArrayList.add(125);
		testArrayList.add(15);
		testArrayList.add(150);
		testArrayList.add(20);
		testArrayList.add(175);
		testArrayList.add(25);
		testArrayList.add(0);
		List<Integer> testList= testArrayList;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(175));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(150));
	}
	
	@Test
	public void  testSecondListImplementationArrayList(){
		CheckList checkList=new CheckList();
		ArrayList<Integer> testArrayList=new ArrayList<Integer>();
		testArrayList.add(25);
		testArrayList.add(93);
		testArrayList.add(97);
		testArrayList.add(18);
		testArrayList.add(71);
		testArrayList.add(114);
		testArrayList.add(52);
		testArrayList.add(48);
		List<Integer> testList= testArrayList;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(114));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(97));
	}
	
	@Test
	public void  testFirstListImplementationLinkedList(){
		CheckList checkList=new CheckList();
		LinkedList<Integer> testLinkedList=new LinkedList<Integer>();
		testLinkedList.add(5);
		testLinkedList.add(100);
		testLinkedList.add(10);
		testLinkedList.add(125);
		testLinkedList.add(15);
		testLinkedList.add(150);
		testLinkedList.add(20);
		testLinkedList.add(175);
		testLinkedList.add(25);
		testLinkedList.add(0);
		List<Integer> testList= testLinkedList;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(175));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(150));
	}
	
	@Test
	public void  testSecondListImplementationLinkedList(){
		CheckList checkList=new CheckList();
		LinkedList<Integer> testLinkedList=new LinkedList<Integer>();
		testLinkedList.add(25);
		testLinkedList.add(93);
		testLinkedList.add(97);
		testLinkedList.add(18);
		testLinkedList.add(71);
		testLinkedList.add(114);
		testLinkedList.add(52);
		testLinkedList.add(48);
		List<Integer> testList= testLinkedList;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(114));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(97));
	}
	
	@Test
	public void  testFirstListImplementationVector(){
		CheckList checkList=new CheckList();
		Vector<Integer> testVector=new Vector<Integer>();
		testVector.add(5);
		testVector.add(100);
		testVector.add(10);
		testVector.add(125);
		testVector.add(15);
		testVector.add(150);
		testVector.add(20);
		testVector.add(175);
		testVector.add(25);
		testVector.add(0);
		List<Integer> testList= testVector;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(175));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(150));
	}
	
	@Test
	public void  testSecondListImplementationVector(){
		CheckList checkList=new CheckList();
		Vector<Integer> testVector=new Vector<Integer>();
		testVector.add(25);
		testVector.add(93);
		testVector.add(97);
		testVector.add(18);
		testVector.add(71);
		testVector.add(114);
		testVector.add(52);
		testVector.add(48);
		List<Integer> testList= testVector;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(114));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(97));
	}
	
	@Test
	public void  testFirstListImplementationStack(){
		CheckList checkList=new CheckList();
		Stack<Integer> testStack=new Stack<Integer>();
		testStack.add(5);
		testStack.add(100);
		testStack.add(10);
		testStack.add(125);
		testStack.add(15);
		testStack.add(150);
		testStack.add(20);
		testStack.add(175);
		testStack.add(25);
		testStack.add(0);
		List<Integer> testList= testStack;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(175));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(150));
	}
	
	@Test
	public void  testSecondListImplementationStack(){
		CheckList checkList=new CheckList();
		Stack<Integer> testStack=new Stack<Integer>();
		testStack.add(25);
		testStack.add(93);
		testStack.add(97);
		testStack.add(18);
		testStack.add(71);
		testStack.add(114);
		testStack.add(52);
		testStack.add(48);
		List<Integer> testList= testStack;
		
		LargestIntegers obj = checkList.check(testList);
		assertEquals(obj.getFirstLargestInteger(),Integer.valueOf(114));
		assertEquals(obj.getSecondLargestInteger(),Integer.valueOf(97));
	}
	
	@Test
	public void testTwoIntegers(){
		List<Integer> testList1 = new ArrayList<Integer>();
		List<Integer> testList2 = new ArrayList<Integer>();
		CheckList checkList=new CheckList();
		
		testList1.add(5);
		testList1.add(10);
		testList2.add(10);
		testList2.add(5);
		
		LargestIntegers obj1 = checkList.check(testList1);
		LargestIntegers obj2 = checkList.check(testList2);
		
		assertEquals(obj1.getFirstLargestInteger(),Integer.valueOf(10));
		assertEquals(obj1.getSecondLargestInteger(),Integer.valueOf(5));
		assertEquals(obj2.getFirstLargestInteger(),Integer.valueOf(10));
		assertEquals(obj2.getSecondLargestInteger(),Integer.valueOf(5));
	}
	
	

}
