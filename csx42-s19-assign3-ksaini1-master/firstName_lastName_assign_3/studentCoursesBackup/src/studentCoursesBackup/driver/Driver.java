
package studentCoursesBackup.driver;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.treebuilder;

import java.util.ArrayList;

import studentCoursesBackup.util.BST;
import studentCoursesBackup.util.Results;
/**
 * @author AuthorName
 *
 */
    
    public class Driver {
	
	public static void main(String[] args) {
	    String ipfile;
	    ipfile=args[0];
	    String opfile=args[2];
	    String op1=args[3];
	    String op2=args[4];
	    treebuilder treeb;
	    
	    /*
	     * As the build.xml specifies the arguments as argX, in case the
	     * argument value is not given java takes the default value specified in
	     * build.xml. To avoid that, below condition is used
	     */

	    // FIXME: update this if statement for this assignment
	  //  if ( (args.length != 3) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")|| args[3].equals("${arg3}")|| args[4].equals("${arg4}")|| args[5].equals("${arg5}")) {
		    
		   // System.err.println("Error: Incorrect number of arguments. Program accepts 6 argumnets.");
		    //System.exit(0);
	  //  } // end of if
	    int bnumber;
	    String course=null;
	    
	    Results rs=new Results();
	    rs.output=opfile;
	    BST tree=new BST(rs);
	    int i=0;
	    FileProcessor fp=new FileProcessor(ipfile);
	    treeb=new treebuilder(tree,tree,tree);
	    ArrayList<String> lines=new ArrayList<String>();
	    lines=fp.readline();
	   // System.out.println(lines);
	    String getlines=new String();
	    		getlines=lines.toString();
	    		
	     	for(String each:lines)
	     	{
		 each=each.replaceAll(" ","");
		 String[] data=each.split(":");
		 
		 try
		 {
			  bnumber = Integer.parseInt(data[0]);
			 course=data[1];
			//System.out.println(course);
			 //System.out.println(bnumber);

			 treeb.insertNode(bnumber,course);
		 }
		 catch(NumberFormatException e)
		 {
			 System.err.println("Number Format Exception Caught");
			 
		 }
		 i++;
	     	} 
	    
	     	tree.printNodes(rs);
	     	//rs.writeToFile(ipfile);
	 //   System.out.println("Hello World! Lets get started with the assignment");
	    
	    
	   // rs.writeToFile(ipfile);
	}  // end public static void main
    }  // end public class Driver
