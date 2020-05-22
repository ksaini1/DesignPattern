package racingDrivers.util;
//import java.io.BufferedWriter;
import java.io.FileWriter;
//import racingDrivers.*;
public class Results implements FileDisplayInterface, StdoutDisplayInterface {

public FileWriter fw=null;
public String output=null;
public StdoutDisplayInterface sdi;
public FileDisplayInterface fdi;

public void writetoFile(String s)
{
	try
	{
		fw=new FileWriter(output);
		fw.write(s);
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
		
	}
	finally
	{
		try
		{
			if(fw!=null)
				fw.close();
	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

public void writetoStdout(String s)
{
	System.out.print(s);
	
}
	
}
