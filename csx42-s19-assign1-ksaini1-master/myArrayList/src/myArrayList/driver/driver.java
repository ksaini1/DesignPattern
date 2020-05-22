package myArrayList.driver;
import myArrayList.myArrayList;

import myArrayList.test.myArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;
//import java.io.FileOutputStream;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class driver {
	
public static void main(String[] args) throws FileNotFoundException 
{
		try
		{
		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
			if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}") )
			{
			
				System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
				System.exit(0);
			}
		
			//System.out.println("Hello World! Lets get started with the assignment");
		
			//FileInputStream in = null;
			//FileOutputStream out = null;
			
			/*in= new FileInputStream("input.txt");
			out= new FileOutputStream("output.txt");
			
			int c;
			while ((c=in.read()) != -1)
			{
				out.write(c);
			}*/
			 String io=args[0];
			 String op= args[1];
			// String forread="READ";
			//FileProcessor fileread=new FileProcessor(io);
			String rline=null;
			
			myArrayList arrays=new myArrayList();
			while((rline=FileProcessor.readLine(io))!=null)
			{
				try {
			if(rline.trim().length()==0)
				continue;
			int value=Integer.parseInt(rline.trim());
			arrays.insertSorted(value);
				}
				catch(NumberFormatException nfe) {
					System.err.println("NUMBER FORMAT EXCEPTION");
					System.exit(0);
					
				}
			}
			
			//arrays.insertSorted();
			Results result=new Results(op);
			
			myArrayListTest tests=new myArrayListTest();
			tests.tests(arrays,result);
}
catch(Exception e)
		{
		e.printStackTrace();
		}

}
}


