package studentCoursesBackup.util;
	import java.io.BufferedReader;
	import studentCoursesBackup.util.*;
	import studentCoursesBackup.util.treebuilder;
	import java.io.FileReader;
import java.util.ArrayList;
	public class FileProcessor {							
		//reading line by line 
		
	public	String f=null;
	public ArrayList<String> array=new ArrayList<String>();
	public	FileProcessor(String ipfile)
	{
		f=ipfile;
	}
	
		public ArrayList<String> readline()
		{
		
			String getlines=null;
			//String firstline=null;
			FileReader fr=null; 
			BufferedReader br=null;
			try
			{
				fr= new FileReader(f);
				br= new BufferedReader(fr);
				//firstline=br.readLine();
				
			//	getlines=br.readLine();
				//System.out.println(getlines);
				
			//	Results rs=new Results();
			
			
				 Results rs=new Results();
				   rs.output="output";
				   while((getlines=br.readLine())!=null)
				   {	rs.writeToFile(getlines);
					   System.out.println(getlines);
					 //  getlines=br.readLine();
					  array.add(getlines);
					   }
				   return array;
			/*	
				{
					
					 
					 System.out.println(getlines);
					//getlines=br.readLine();
					 rs.writeToFile(getlines);
					 collect.append(getlines);
				}*/
			/*	cd=collect;
				return collect;
			*/
			}
			catch(Exception e)
			{
				e.printStackTrace();
				//return null;
			}
			finally{
				  try {
	                if(fr != null) {
	                    fr.close();
	              //      return null;
	                }
	                if(br != null) {
	                    br.close();
	                //    return null;
	                }
	            }
	            catch(Exception e) {
	                e.printStackTrace();
	                //return null;
	            }
	        }
			return array;
				
				
				
		
	}
	}

	
