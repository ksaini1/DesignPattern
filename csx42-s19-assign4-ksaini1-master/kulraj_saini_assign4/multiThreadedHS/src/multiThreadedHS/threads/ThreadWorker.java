package multiThreadedHS.threads;

import java.util.ArrayList;
import java.util.Collections;
import multiThreadedHS.util.*;
//import multiThreadedHS.driver.Driver;



public class ThreadWorker extends Thread
{
    ArrayList<String> filenames=new ArrayList<String>();
	public int q=0;
	public ArrayList<String> back=new ArrayList<String>();
	public ArrayList<Integer> each=new ArrayList<Integer>();

	HeapSort hp=new HeapSort();
    FileProcessor fp=new FileProcessor(filenames);
    
	public ThreadWorker(    ArrayList<String> sfilenames,int j)
{			
		MyLogger.writeMessage("THREAD WORKER CONSTRUCTOR INVOKED", MyLogger.DebugLevel.CONSTRUCTOR);
		filenames=sfilenames;
			q=j;
			MyLogger.writeMessage("NEW THREAD",MyLogger.DebugLevel.THREAD_CREATE);
}
public void run()
{
    FileProcessor fp=new FileProcessor(filenames);
	//HeapSort hp=new HeapSort();
	back=fp.readline(q);
	each=sorting(back);
}

public ArrayList<Integer> sorting(ArrayList<String> allelements)		//Selection Sort
{		ArrayList<Integer>	intList=new ArrayList<Integer>();
	try {
		MyLogger.writeMessage("SORTING OF THREAD's INPUT FILE", MyLogger.DebugLevel.SORTING);
			int count=0;
		
				for(String s :allelements) intList.add(Integer.valueOf(s));	//String type to integer type arrayList

				for(int i=0;i<intList.size()-1;i++)		
				{	
				count=i;
					for(int j=i+1;j<intList.size();j++)
						{
							if(intList.get(j)<intList.get(count))
							count=j;
							Collections.swap(intList,count,i);
						}
		//for(int j=)
				}
		return intList;
		}
		catch(NumberFormatException e)
		{
		System.err.println("ONLY NUMBERS ACCEPTED");
			System.exit(0);
		}
	return intList;
}
}