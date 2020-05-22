package racingDrivers.util;

//import racingDrivers.util.Fileprocessor;
import racingDrivers.driverStates.DriverContextI;
import racingDrivers.driverStates.DriverStateI;

public class RaceContextClass implements DriverContextI,DriverStateI
{	StringBuilder allnumbers=null;
	String States=new String();
	String Positions=new String();
	StringBuilder alltexts=null;
	
	public int drivernumbers=0;
	int i=0;
	int distance[];
	int distdrove[];
	/**
	 * To save the string recieved line by line into one string in out program
	 * @param lines
	 */
	public void RaceContext(String lines)
	{	int j=0;
		
		while(j<lines.length())
		{ 	
			allnumbers.setCharAt(i++,lines.charAt(j++));
			//allnumbers.charAt(i++)=lines.charAt(j++);
		}
		
		
	}
	/**
	 * to get the 1st element that is the driver from the string
	 */
	public void getdriver()
	{
		drivernumbers=Character.getNumericValue(allnumbers.charAt(0));
		if(drivernumbers<=3)
		{
			System.out.println("Number of drivers less than 4");
			System.exit(0);
			
		}
	
	}
	/**
	 * the rest of the elements in the string is stored in an other array distance
	 */
	public void getdistance()
	{	char checks=' ';
		int i=0;
		int j=1;
		while(j<=allnumbers.length())
		{	
			if(allnumbers.charAt(j)!=checks)
			{
			distance[i++]=Character.getNumericValue(allnumbers.charAt(j++));
			}
		}
		
	}
	/**
	 * the function which is mainly called to set the state and position of the driver with the loop iterates for no. of drivers 
	 */
	
	public void setstate()
	{	int j=0;
	 Results rr=new Results();

	
		for(int k=0;k<drivernumbers;k++)
		{
			distdrove[k]=0;
		}
		
		while(j<distance.length)
		{
			
			for(int i=0;i<drivernumbers;i++)
			{
			distdrove[i]=distdrove[i]+ distance[j++];
			 
			
			
			}
			positions(distdrove);
	
		}
		
		rr.writetoFile(alltexts.toString());
	}
	/**
	 * to specify the state of the drivers according to the given conditions 
	 * @param distcovered the total distance covered by each driver after a minute 
	 */
	public void positions(int []distcovered)
	{
	//String spacing;
	//Results rr=new Results;
	
	for(int m=0;m<drivernumbers;m++)
	{		
		if(distcovered[m]<(0.3*drivernumbers))
		{
			leading();
		}	
		if((0.3*drivernumbers)<=distcovered[m]&&distcovered[m]<(0.7*drivernumbers))
		{
			holding();
		}
		if(distcovered[m]>=(0.7*drivernumbers))
		{
			losing();
		}
		
		

		
	}
	System.out.println(" ");
	 alltexts.append("\n");
	}
	
	public void losing()
	{
	 States="RECKLESS ";
	 Positions="LOSING ";
	 Results r=new Results();
	 alltexts.append(States);
	 r.writetoStdout(Positions);
	}
	
	public void leading()
	{
	 States="CONFIDENT ";
	 Positions="LEADING ";
	 Results r=new Results();
	 alltexts.append(States);
	 r.writetoStdout(Positions);
	}
	
	public void holding()
	{
	 States="CALCULATIVE ";
	 Positions="HOLDING_ON ";
	 Results r=new Results();
	 alltexts.append(States);
	 r.writetoStdout(Positions);
	}
	
	
}
		
	