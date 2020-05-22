package multiThreadedHS.util;

//import multiThreadedHS.threads.ThreadWorker;
import java.util.ArrayList;
//import multiThreadedHS.driver.Driver;
public class HeapSort
{
	public ArrayList<Integer> joined=new ArrayList<Integer>();
	
	public ArrayList<Integer> joining(ArrayList<Integer> fi)
	{
		MyLogger.writeMessage("THREAD IS BEING JOINED", MyLogger.DebugLevel.JOINING);
		joined.addAll(fi);
	
		return joined;
	}
	
	public void MergeSort()
	{	
		divide(0,joined.size()-1);
	}
	
	public ArrayList<Integer> getsorted()
	{	
		
		return joined;
	}

	
	public void divide(int startindex,int endindex)
	{
		if(startindex<endindex&&(endindex-startindex)>=1)
		{
			int mid=(endindex+startindex)/2;
			divide(startindex,mid);
			divide(mid+1,endindex);
			//merging Sorted array produce above into one sorted array
			merger(startindex,mid,endindex);            
	       
		}
	}
public void merger(int startIndex,int midIndex,int endIndex)

		{
        //Below is the mergedarray that will be sorted array Array[i-midIndex] , Array[(midIndex+1)-endIndex]
        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();
        
        int leftIndex = startIndex;
        int rightIndex = midIndex+1;
        
        while(leftIndex<=midIndex && rightIndex<=endIndex)
        	{
            if(joined.get(leftIndex)<=joined.get(rightIndex))
            {
                mergedSortedArray.add(joined.get(leftIndex));
                leftIndex++;
            }else
            {
                mergedSortedArray.add(joined.get(rightIndex));
                rightIndex++;
            }
        	}       
        //Either of below while loop will execute
        while(leftIndex<=midIndex){
            mergedSortedArray.add(joined.get(leftIndex));
            leftIndex++;
        }
        
        while(rightIndex<=endIndex){
            mergedSortedArray.add(joined.get(rightIndex));
            rightIndex++;
        }
        
        int i = 0;
        int j = startIndex;
        //Setting sorted array to original one
        while(i<mergedSortedArray.size()){
            joined.set(j, mergedSortedArray.get(i++));
            j++;
        }
		}
	
}