package myArrayList.util;
//import java.io.IOException;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.FileNotFoundException;




public class FileProcessor  {
		
	public FileProcessor(String path) 
	{	
		try {
/*			
		FileReader files=new FileReader(path);
		BufferedReader br=new BufferedReader(new FileReader(path));
	
		String readline;
		File file= new File(path);

		check if correct file is present in output without any possible exception
	
		readline=readLine(path);
			
		//	while (( readline=br.readline())!= null)
	*/		
			if(path==null)
			{
				System.err.println( " False path");
				
			}	
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
	
public static String readLine(String path) //throws FileNotFoundException
{
	
	String line=null;	
		try {  	
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(path));
			while(path!=null)
			{
			line= reader.readLine();
			}
			
	/*	while (line != null) {
			System.out.println(line);
			// read next line
			line = reader.readLine();
		}*/
		reader.close();
	} catch (Exception e) {
		System.err.println("FileProcessor:readLine - IO Exception Occured :: "  + e.getLocalizedMessage());
		
	}
		return line;
}
}