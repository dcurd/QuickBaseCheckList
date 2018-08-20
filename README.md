This exercise is to accomplish the coding API exercise for Quick Base.

API Exercise: 

API Automation Exercise
Coding Exercise 1:
Build a Java Class that returns the a list containing the Largest and Second Largest Number 
from a static List of Integers
Call the method twice and pass in different lists as arguments
Use the following lists:  { 5,100,10,125,15,150,20,175,25,0 },  { 25,93,97,18,71,114,52,48 }
Result: The method returns both the largest and second largest number in each list
Coding Exercise 2:
Given the Java class implemented from exercise 1:
Add a size limit check to the implementation from exercise1 that throws an IllegalArgumentException if size of the list less than two.
Create the test cases and class(s) needed to validate the implementation from exercise1
Result: Test class and associated framework implemented



CheckList.java:
This class was created that sorts through a static list of Integers and 
returns the Largest and Second Largest Number. The implementation
desired was a little confusing and so what is returned is a POJO with the Largest and
Second Largest Integers from a list. If this was wanted to be put in a List, than call the get
methods and add sequentially to a list.
To sort through a list, call the checkList method. If the list contains less than two items in
the list of integers, an IllegalArgumentException is thrown.
Otherwise, the sort of the list begins with the first two items being sorted into the Largest Integers
POJO. Afterwards, if the list contains more than two integers, than the sorting continues.

CheckListSpecific.java:
With the above instructions, I want to make sure the points were covered for the two specific lists
referenced in:"Call the method twice and pass in different lists as arguments
Use the following lists:  { 5,100,10,125,15,150,20,175,25,0 },  
{ 25,93,97,18,71,114,52,48 }".
Call the method checkSpecificImplementation to iterate through these two lists. This will return
the LargestIntegersSpecific POJO which contains the Largest Integer and Second Largest Integers 
for both lists.

Included are the JUnit test classes to test CheckList.java and CheckListSpecfic.java:
-CheckListSpecificTest
-CheckListTest

CheckListSpecificTest.java:
JUnit Test class to test CheckListSpecific.java. Verifies that CheckListSpecific.java returns
175 and 150 for list { 5,100,10,125,15,150,20,175,25,0 } and 114 and 97 for list { 25,93,97,18,71,114,52,48 }

CheckListTest.java:
JUnit Test class to test CheckList.java.
Verifies that IllegalArgumentException is thrown for any list containing less than two items.
Verifies every implementation of List interface.
Verifies two different list of different lengths to confirm values
Verifies list containing two items with different positions
Verifies list with negative integers
Verifies list with negative and positive integers