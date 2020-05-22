package studentCoursesBackup.myTree;

import java.util.ArrayList;

//import studentCoursesBackup.util.FileProcessor;
//import studentCoursesBackup.util.treebuilder;

public class Node implements ObserverI,SubjectI, Cloneable 
{	public ArrayList<ObserverI> observers;
	public ArrayList<String> courses;
	public Node left;
	public Node right;
	public int bnumber;
	
	
	public Node()
	{
		courses=new ArrayList<String>();
		observers=new ArrayList<ObserverI>();
		
		
	}
	public void setCourses(ArrayList<String>courseinsert)
	{		
		courses=courseinsert;
		
	}
	@Override
	public String toString()
	{
		return bnumber+":"+ courses.toString();
		
		
	}
	public void addCourse(ArrayList<String> courseinsert,Node temp)
	{
		temp.courses.addAll(courseinsert);
	}
	public void setleft(Node leftin)
	{
		this.left=leftin;
	}
	public void setright(Node rightin)
	{
		this.right=rightin;
	}
	public Object Clone() throws CloneNotSupportedException
	{
		Node node=new Node();
		node.bnumber=bnumber;
		node.setCourses(new ArrayList<>(courses));
		return node;
	}
	public void setbnumber(int bnumberinsert)
	{
		bnumber=bnumberinsert;
	}
	@Override
	public void notifyAll(String course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeoberver(ObserverI o) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void registerObeserver(ObserverI o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String course) {
		// TODO Auto-generated method stub
		
	}
	
}