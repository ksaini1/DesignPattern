package multiThreadedHS.util;
import java.io.BufferedReader;
//import multiThreadedHS.util.Results;
import java.io.FileReader;
import java.util.ArrayList;
public class FileProcessor {							
	//reading line by line 
	
public	ArrayList<String> f=null;
public	FileProcessor(ArrayList<String> ipfile)
{	MyLogger.writeMessage("FILE PROCESSOR CONSTRUCTOR INVOKED", MyLogger.DebugLevel.CONSTRUCTOR);
	f=ipfile;
	
}

	public ArrayList<String> readline(int k)
	{
		 ArrayList<String> array=new ArrayList<String>();	

		String getlines=null;
		FileReader fr=null;  
		BufferedReader br=null;
		try
		{	
			fr= new FileReader(f.get(k));
			br= new BufferedReader(fr);
			while((getlines=br.readLine())!=null)
			   {
				
				array.add(getlines);
			   }
			k++;
			return array;
		}
		
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			  try {
                if(fr != null) {
                    fr.close();
                }
                if(br != null) {
                    br.close();
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
		return array;
	
}
}
