package myArrayList.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.util.List;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
String outpt;

		public Results(String oppath) 
		{
			outpt=oppath;

		}
		
		public void writeToFile(String s)
		{	
			try
			{
			BufferedWriter writes=new BufferedWriter(new FileWriter(s));
			writes.write(s);
			writes.close();
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
		//	writes.close();
			}
		}
		
		
		public void writeToStdout(String s)
		{
		if(s==null|| s.isEmpty())
			return;
		
		while(s !=null)
			System.out.println(s);
		}
		public void storeresult(String finl)
		{
			
		String store;
		store=finl;
		writeToStdout(store);
		}
}