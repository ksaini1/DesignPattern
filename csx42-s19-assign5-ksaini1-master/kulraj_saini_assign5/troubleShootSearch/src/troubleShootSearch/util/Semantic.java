package troubleShootSearch.util;

import java.util.ArrayList;
import java.util.Arrays;

public class Semantic implements visitable {
	
	String store=new String();	
	
	public String semantic(ArrayList<String> Product,ArrayList<String> userlist,ArrayList<String> semantics)
	{
		
		/*
		 * SEMANTIC CHECKING OF THE SYNONYMSs
		 */
		MyLogger.writeMessage("SEMANTIC MATCH IS INVOKED", MyLogger.DebugLevel.SEMANTIC);
	String lastword=null;
	String synonym=null;
	String matchfound="";
	String temp="";
	int flag=0;
		for(int i=0;i<Product.size();i++)
		{
			for(int j=0;j<userlist.size();j++)
			{
				for(int k=0;k<semantics.size();k++)
				{	
						lastword=userlist.get(j);
						String arr[]=lastword.split(" ");
						lastword=arr[arr.length-1];
						temp=semantics.get(k);
						temp=temp.substring(temp.indexOf(":")-1);
						
						if(semantics.get(k).contains(lastword))
						{	
							lastword=semantics.get(k);
							lastword=lastword.substring(lastword.indexOf(":")+1);
							//System.out.println(lastword);
						}
						arr[arr.length-1]=lastword;
						synonym=Arrays.toString(arr);
						synonym=synonym.substring(1,synonym.length()-1).replace(",", "");
					
						if(Product.get(i).contains(synonym))
						{	
							matchfound=matchfound+" "+Product.get(i)+"\n";
							//System.out.println("Exact Match Found");
							flag=1;
						}
					
				}
			
			}
		}
		if(flag==1)
		{
			//System.out.println("Exact Match Found for a synonym");
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
