package troubleShootSearch.util;

import java.util.ArrayList;

public class Exact implements visitable{
	String res=new String();
	/*
	 * THE EXACT FUNCTION IS TO CHECK ALL THE EXACT CODE NEEDED
	 */
	public String exactmatch(ArrayList<String> Product,ArrayList<String> userlist)
	{	MyLogger.writeMessage("EXACT MATCH FUNCTION IS INVOKED", MyLogger.DebugLevel.EXACT);
		int flag=0;
		String matchfound="";

		for(int i=0;i<Product.size();i++)
		{
			for(int j=0;j<userlist.size();j++)
			{
				if(Product.get(i).contains(userlist.get(j)))
				{	
					matchfound=matchfound+" "+Product.get(i)+"\n";
					//System.out.println("Exact Match Found");
					flag=1;
				}
		
			}
		
		}
		if(flag==1)
		{
			//System.out.println("Exact Match Found");
		}
		res=matchfound;
	    singleton single=singleton.getinstance();
	    single.getstr(matchfound);
		return matchfound;
	}

	   public String accept(troubleSearch visiting) {

		 
		           return visiting.visit(this);
		   
		       }
	 

	
}

