package troubleShootSearch.util;

public class singleton {
private static singleton first=null;
String storeall=new String();	
public static singleton getinstance()
	{
		 
		if(first==null)
		{
			first=new singleton();
		}
		return first;
	}
	public String returnall()
	{
		return first.storeall;
	}
	public void getstr(String str)
	{
		if(first.storeall==null)
		{
			first.storeall=str;
		}
		else
		{
			first.storeall=first.storeall+"\n";
			first.storeall=first.storeall+str;
			
		}
		
	}
}
