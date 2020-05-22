package multiThreadedHS.driver;

import java.util.ArrayList;
//import multiThreadedHS.util.FileProcessor;
import multiThreadedHS.util.*;
import multiThreadedHS.threads.ThreadWorker;

public class Driver {

	public static ArrayList<Integer> merged=new ArrayList<Integer>();
public static void main(String[] args) throws InterruptedException {
    String tnumber=null;
    tnumber=args[0];

    int tnum;

    try {
    
    	
        tnum=Integer.parseInt(tnumber);
        if (args.length != tnum+3  )
    	{
    	
    		System.err.println("Error: Incorrect number of arguments. Program accepts"+(tnum+3)+" argumnets.");
    		System.exit(0);
    	}
     
        
        String debug=args[tnum+2];  
   
   //System.out.println(debug);
    int debugvalue=Integer.parseInt(debug);
    MyLogger.setDebugValue(debugvalue);
    if(debugvalue>4 || debugvalue<0)
    {	
    	System.err.println("INCORRECT DEBUG VALUE");
    	System.exit(0);
    }
     
    ArrayList<String> filenames=new ArrayList<String>();
   for(int k=1;k<=tnum;k++)
   {
	   filenames.add(args[k]);
   }
   
  ThreadWorker thread[]=new ThreadWorker[tnum];
  
	
    String opfile=args[tnum+1];
    
    Results rs=new Results();
    rs.output=opfile;
   // ArrayList<Integer> cc=new ArrayList<Integer>();
    //FileProcessor fp=new FileProcessor(filenames);
    HeapSort h=new HeapSort();
     			for(int j=0;j<tnum;j++)
     			{	//ArrayList<String> collect=new ArrayList<String>();
     				thread[j]=new ThreadWorker(filenames,j);
     				thread[j].start();
     				thread[j].join();

     			}

     //  System.out.println(cc);
     			for(int l=0;l<tnum;l++) 
     			{
     			h.joining(thread[l].each);	
     			}

     			h.MergeSort();
     			merged=h.getsorted();
     			String merge=new String();     		
     			for (Integer s : merged)
     			{
     			    
     				String temps=s.toString();
     				String addzeros="";
     				if(temps.length()<5) {
     					
     					if(temps.length()==1) {
     						
     						addzeros="0000";
     					}
     					else if(temps.length()==2) {
     						
     						addzeros="000";
     						
     					}
     					else if(temps.length()==3) {
     						
     						addzeros="00";
     						
     					}
     					else if(temps.length()==4) {
     						
     						addzeros="0";
		
     					}
     				}
     				merge += addzeros+s + "\n";
     			}

     			rs.writeToFile(merge);
     			
     			if(debugvalue!=0)
     			{
     				rs.writeToStdout(merge);
     			}
     			
     			
    	}
     			catch(NumberFormatException e)
     		    {
     		    	//e.printStackTrace();
     		    	System.err.println("PLEASE ENTER A NUMBER");
     		    	
     		    } 	
    			finally
    			{
    				System.exit(0);
    			}
	 try
	 {

	 }
	 catch(NumberFormatException e)
	 {
		 System.err.println("Number Format Exception Caught");
		 
	 }
	
    
 
} 
}  
