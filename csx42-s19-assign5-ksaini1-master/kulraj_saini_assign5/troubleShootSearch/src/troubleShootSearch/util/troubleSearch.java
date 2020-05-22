package troubleShootSearch.util;
import java.util.ArrayList;
import java.util.Arrays;
import troubleShootSearch.util.Exact;
import troubleShootSearch.util.Stemming;
import troubleShootSearch.util.Semantic;
public class troubleSearch implements visitors{
	public static ArrayList<String> Product1=new ArrayList<String>();
	public static ArrayList<String> Product2=new ArrayList<String>();
	public static ArrayList<String> Product3=new ArrayList<String>();
	public static ArrayList<String> Product4=new ArrayList<String>();
	public static ArrayList<String> userLists=new ArrayList<String>();
	public static ArrayList<String> semantic=new ArrayList<String>();
	 ArrayList<ArrayList<String> > aList = new ArrayList<ArrayList<String> >();
	 String store=new String();
	 String p1=new String();
	 String p2=new String();
	 String p3=new String();
	public troubleSearch(ArrayList<String> product1,ArrayList<String> product2,ArrayList<String> product3,ArrayList<String> product4,ArrayList<String> userList,ArrayList<String> semantics)
	{	
	Product1=product1;
	Product2=product2;
	Product3=product3;
	Product4=product4;
	userLists=userList;
	semantic=semantics;
	store=" ";
	   aList.add(Product1);
	   aList.add(Product2);
	   aList.add(Product3);
	   aList.add(Product4);
	}
	
@Override
public String visit(Exact exact) {
	String result=new String();
	for(int i=0;i<aList.size();i++)
	{
		p1=p1+"\nEXACT MATCH FOUND IN PRODUCT"+(i+1);
	//	System.out.println("EXACT MATCH FOUND IN PRODUCT"+(i+1));
	p1=p1+"\n"+exact.exactmatch(aList.get(i), userLists);
	}
	//System.out.println(p1);

	
	return p1;
}
@Override
public String visit(Semantic semantc) {
	String result=new String();
	for(int i=0;i<aList.size();i++)
	{
		p2=p2+"\nSEMANTIC MATCH FOUND IN PRODUCT"+(i+1);
	//System.out.println("SEMANTIC MATCH FOUND IN PRODUCT"+(i+1));
	result=semantc.semantic(aList.get(i), userLists, semantic);
	p2=p2+"\n"+result;
	
	}
	//System.out.println(p2);
	store.concat(result);

	return p2;
}
@Override
public String visit(Stemming stem) {
	String result=new String();
	for(int i=0;i<aList.size();i++)
	{	
	p3=p3+"\n MATCH FOUND FOR THE FIRST WORD IN PRODUCT"+(i+1);
	//System.out.println("MATCH FOUND FOR THE FIRST WORD"+(i+1));
	result=stem.stemming(aList.get(i), userLists);
	p3=p3+"\n"+result;
	}
	//System.out.println(p3);

	store.concat(result);

	return p3;
}

}
