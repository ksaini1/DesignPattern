
package racingDrivers.driver;

//import racingDrivers.util.Mylogger;

import racingDrivers.util.RaceContextClass;
import racingDrivers.util.FileProcessor;

/**a
 * @author Kulraj Saini	
 *
 */
    
    public class Driver {
	
	public static void main(String[] args) {
	    
	    String inputfile = new String();
	    
	    if ( (args.length != 3) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")) 
	    { 
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts 3 argumnets.");
		    System.exit(0);
	    } // end of if
		if(!inputfile.isEmpty())
		{
			System.out.println("Enter a valid input file");
			System.exit(0);
		}
		inputfile=args[0];
	//	String outputfile = args[1];
	//	String Debugval= args[2];
			FileProcessor fl=new FileProcessor();
			fl.readline(inputfile);
			
			RaceContextClass rc=new RaceContextClass();
			rc.getdriver();
			rc.getdistance();
			
			rc.setstate();
			
		
	    
	    System.out.println("Hello World! Lets get started with the assignment");
	    
	}  // end public static void main
    }  // end public class Driver