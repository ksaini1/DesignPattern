package myArrayList.test;

import myArrayList.myArrayList;
import myArrayList.util.Results;

public class myArrayListTest {

	public  void tests(myArrayList lists,Results results) {
		testinsert1(lists,1,results);
		testinsert1(lists,11,results);
		testindex(lists,10,results);
		testsize(lists,results);
		sum(lists,results);
		testremove(lists,111,results);
		testcompact(lists,results);
	}
	public void testremove(myArrayList myArrayList, int value,Results results)
	{
		int osz = myArrayList.size();
		myArrayList.removeValue(value);
		int nsz = myArrayList.size();
		if(osz == nsz+1)
			System.out.println("REMOVE ARRAY TEST CASE:FAILED");
		else
			System.out.println("REMOVE ARRAY TEST CASE:PASSED");
			
	} 

	public void testcompact(myArrayList myArrayList,Results results)
	{
		int value=-1;
		int osz = myArrayList.size();
        myArrayList.removeValue(value);
        myArrayList.compact();
        int nsz = myArrayList.size();
        if(osz > nsz) {
        	System.out.println("ArrayCompact test case: PASSED");
        }
        else {
        	System.out.println("ArrayCompact test case: FAILED");
        }
	} 


	public void testinsert1(myArrayList myArrayList, int value,Results results)
	{

		int osz = myArrayList.size();
		myArrayList.insertSorted(value);
		int nsz = myArrayList.size();
		if(osz == nsz+1)
		{	
			System.out.println("INSERT ARRAY TEST CASE:FAILED");
	
		}
		else
		{System.out.println("INSERT ARRAY TEST CASE:PASSED");
		//break;
		}
	}	 
	public void testindex(myArrayList myArrayList, int value,Results results)
	{
		int index=myArrayList.indexOf(value);
		if(index!=-1)
			System.out.println("INDEX OF TEST:PASSED");
		
		else 
			System.out.println("INDEX OF TEST: FAILED");
		
	
	}
	public void testsize(myArrayList myArrayList,Results results)
	{
	int size= -2;
	size=myArrayList.size();
	if(size!=-2)
		System.out.println("SIZE OF ARRAY TEST: PASSED");
	
	else
		System.out.println("SIZE OF ARRAY TEST:FAILED");
		
	} 		
	
	public void sum(myArrayList myArrayList,Results results)
	{	int ans;

		ans=myArrayList.sums();
		String send;
		send=myArrayList.toString();
		results.writeToFile(send);
	} 	
			
	
}
