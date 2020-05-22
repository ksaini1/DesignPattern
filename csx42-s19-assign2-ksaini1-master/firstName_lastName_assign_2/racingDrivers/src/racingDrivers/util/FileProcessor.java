package racingDrivers.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileOutputStream;
//import racingDrivers.racingDrivers;
//import racingDrivers.driverStates.DriverContextI;

public class FileProcessor {
	
	
	
	RaceContextClass DC=new RaceContextClass();;
	
	
	
	//reading line by line 
	
	public void readline(String ipfile)
	{
		String getlines=null;
		//String firstline=null;
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr= new FileReader(ipfile);
			br= new BufferedReader(fr);
			//firstline=br.readLine();
			
			getlines=br.readLine();
			System.out.println(getlines);
			
		

			while((getlines=br.readLine())!=null)
			{
				DC.RaceContext(getlines);
				
				System.out.println(getlines);
				getlines=br.readLine();
				
	
			}
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
			
			
			
	
}
}
