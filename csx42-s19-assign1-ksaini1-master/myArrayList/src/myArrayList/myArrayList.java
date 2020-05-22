package myArrayList;
//import myArrayList.util.FileDisplayInterface;
//import myArrayList.util.StdoutDisplayInterface;

public class myArrayList //implements FileDisplayInterface, StdoutDisplayInterface {
{
int s1=50;
private int[] array=new int[s1];
private int index=-1;

public myArrayList() {
	

}
public String toString() {
	StringBuilder bld=new StringBuilder();
	bld.append("(");
	for(int i=0;i<=index;i++)
	{	
	if(i!=0)
		bld.append(",");
	
		bld.append(array[i]);
}
	bld.append(")");
	return bld.toString();
}
public int removeValue(int value)
{
	int position=0;
	if(index==-1)
		return index;
	int i=0;
	while(i<index)
	{
		for(int j=0;j<=index;j++)
			if(array[j]==value)
			{
				array[j]=-1;
			}
	}
	i++;
	
	return position;
}

public int indexOf(int value)
{
	if(index==-1)
		return -1;
	
	for(int i=0;i<+index;i++)
	{
		if(array[i]==value)
			return i;
		
	}

 return -1;
}
public void compact()
{	for(int j=0;j<index;j++)
	{
	if(array[j]==-1)
	{
		for(int k=j;k<=index;k++)
	{
	
		array[k]=array[k+1];
	}
	
	}
	}
}

private void increasesize()
{
	
	int s2;
	s2=s1+(int)Math.round(s1*0.25);
	
	int newsize= s2;
	
	int[] temp=new int[newsize];
	
	for(int i=0;i<array.length;i++)
	{
		temp[i]=array[i];
		
	}
	
		array=temp;
		
}
public int sums()
{
	int sum=0;
	for(int i=0;i<=index;i++)
	sum=sum+array[i];
	
	return sum;
}

private void sort()
{
	for(int i=0;i<= index;i++)
	{
		for(int j=i+1; j<=index;i++)
		{
			if(array[i]>=array[j])
			{
				int temp;
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
}

public void insertSorted( int newValue)
{
	index+=1;
	
	array[index]=newValue;
	
	sort();
	
}
public int size()
{
	return index+1;
	
}
public void sizecheck()
{
	if(array.length==index+1)
	{
		increasesize();
	}
}
}


