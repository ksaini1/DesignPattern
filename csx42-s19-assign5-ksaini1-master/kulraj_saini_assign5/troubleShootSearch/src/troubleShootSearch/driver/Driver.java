package troubleShootSearch.driver;

import java.util.ArrayList;

import troubleShootSearch.util.MyLogger;
import troubleShootSearch.util.Exact;
import troubleShootSearch.util.Stemming;
import troubleShootSearch.util.Semantic;
//import multiThreadedHS.util.FileProcessor;
import troubleShootSearch.util.*;


public class Driver {

	public static ArrayList<String> Product1=new ArrayList<String>();
	public static ArrayList<String> Product2=new ArrayList<String>();
	public static ArrayList<String> Product3=new ArrayList<String>();
	public static ArrayList<String> Product4=new ArrayList<String>();
	public static ArrayList<String> userList=new ArrayList<String>();
	public static ArrayList<String> semantics=new ArrayList<String>();
public static void main(String[] args) throws InterruptedException {
   
    try {
    	
    	if ( (args.length != 8) ) 
    		{    
    			System.err.println("Error: Incorrect number of arguments. Program accepts 8 argumnets.");
    			System.exit(0);
    		}
    	
	String product1=args[0];
	String product2=args[1];
	String product3=args[2];
    String product4=args[3];
    String userinput=args[4];
    String smnts=args[5];
    String output=args[6];
    String catchmatch=new String();
    String catchmatch2=new String();
    String catchmatch3=new String();
    String debug=args[7];
    int debugvalue=Integer.parseInt(debug);
    MyLogger.setDebugValue(debugvalue);

    if(debugvalue>4)
    {
    	System.err.println("ENTER VALID DEBUG VALUE");
    	System.exit(0);
    }
   /*
    * ALL FILES ARE READ AND STORED IN THE RESPECTIVE ARRAY LISTS
    */
    FileProcessor f1=new FileProcessor(product1);
    Product1=f1.readline();
    FileProcessor f2=new FileProcessor(product2);
    Product2=f2.readline();
    FileProcessor f3=new FileProcessor(product3);
    Product3=f3.readline();
    FileProcessor f4=new FileProcessor(product4);
    Product4=f4.readline();  
    FileProcessor f5=new FileProcessor(userinput);
    userList=f5.readline();
    FileProcessor f6=new FileProcessor(smnts);
    semantics=f6.readline();
    troubleSearch sr=new troubleSearch(Product1,Product2,Product3,Product4,userList,semantics);
    
    singleton single=singleton.getinstance();
    Exact ex=new Exact();
    Semantic sm=new Semantic();
    Stemming st=new Stemming();
    
   catchmatch=ex.accept(sr);
    catchmatch2=st.accept(sr); 
    catchmatch3=sm.accept(sr);
    String storeall=new String();
    storeall=storeall+catchmatch+catchmatch2+catchmatch3;
  
    // storeall=single.returnall();
  //  System.out.println(storeall);
    Results rs=new Results();
    rs.output=output;	
    if(debugvalue!=0)
    {
     System.out.println("\nTROUBLESHOOT SEARCH RESULTS ");
     System.out.println("......................................................................");
     rs.writeToStdout(storeall);

    }
    rs.writeToFile(storeall);
    	}
     			catch(NumberFormatException e)
     		    {
     		    	//e.printStackTrace();
     		    	System.err.println("PLEASE ENTER A VALID INPUT");
     		    	
     		    } 	
    			finally
    			{
    				System.exit(0);
    			}
	

} 
}  
