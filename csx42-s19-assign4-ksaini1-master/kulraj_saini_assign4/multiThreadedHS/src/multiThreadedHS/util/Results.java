package multiThreadedHS.util;

import java.io.FileWriter;

import multiThreadedHS.util.FileDisplayInterface;
import multiThreadedHS.util.Results;

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
	   
	    public void writeToStdout(String s) {
	        System.out.println(s);
	    }
	    
	    
	    }
