package troubleShootSearch.util;

import java.util.ArrayList;

public class Stemming implements visitable {
	String store=new String();
	public String stemming(ArrayList<String> Product,ArrayList<String> userlist)
	{	int flag=0;
	MyLogger.writeMessage("STEMMING MATCH INVOKED", MyLogger.DebugLevel.STEMMING);
/*
 * STEMMING FUNCTION FOR 1ST WORD SIMILIAR SEARCH
 */
	String matchfound="";
	String stem=null;
		for(int i=0;i<Product.size();i++)
		{
			for(int j=0;j<userlist.size();j++)
			{	
				stem=userlist.get(j);
				String arr[]=stem.split(" ",2);
				stem=arr[0];
				if(Product.get(i).contains(stem))
					{	
						matchfound=matchfound+" "+Product.get(i)+"\n";
						//System.out.println("Exact Match Found");
						flag=1;
					}
			

			}
		
		}
	if(flag==1)
	{
	//	System.out.println("Match for the 1st keyword found");
	}
	store=matchfound;
	singleton single=singleton.getinstance();
    single.getstr(matchfound);
	return matchfound;
	}
	
		
	   public String accept(troubleSearch visiting) {
		

		           return visiting.visit(this);
		   
		       }
}
