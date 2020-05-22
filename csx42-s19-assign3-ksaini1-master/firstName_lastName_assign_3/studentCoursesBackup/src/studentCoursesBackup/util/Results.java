package studentCoursesBackup.util;

import java.io.FileWriter;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	 public FileWriter fw = null;
	    public String output = null;
	    public StdoutDisplayInterface sdi;
	    public FileDisplayInterface fdi;
	    public int size;
	    
	    

	    /**
	     * This method writes to file
	     * @param s 
	     */
	    @Override
	    public void writeToFile(String s) {
	        try {
	            fw = new FileWriter(output);
	            fw.write(s);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (fw != null) {
	                    fw.close();
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    /**
	     * This method gives output on console
	     * @param s 
	     */
	    @Override
	    public void writeToStdout(String s) {
	        System.out.println(s);
	    }
	    
	    /**
	     * This method is used to initialize objects
	     */
	    public void initialize() {
	        sdi = new Results();
	        fdi = new Results();
	    }
	    public void storeNewResult(String outputln)
	    {
	    	if(size==outputln.length())
	    	{
	   // 		resizeOutputArray(outputln);
	    	}
//	    //outputln[size]=output;
	    }
	   
	    public void resizeOutputArray(String [] outputln)
	    {
	    	
	    }

	    }

	

