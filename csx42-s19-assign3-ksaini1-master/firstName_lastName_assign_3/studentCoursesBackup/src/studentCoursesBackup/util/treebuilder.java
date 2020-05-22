package studentCoursesBackup.util;

import java.util.ArrayList;

//import studentCoursesBackup.driver.Driver;
import studentCoursesBackup.myTree.Node;
public class treebuilder 
{
	public BST subject,ob1,ob2;
	public treebuilder(BST tree,BST tree_1,BST tree_2)
	{	subject=tree;
		ob1=tree_1;
		ob2=tree_2;
	}

	public void insertNode(int bnumber,String courseinsert)
	{
		try {
			Node node=new Node();
			ArrayList<String>courses= new ArrayList<String>();
			//validation to be added
			courses.add(courseinsert);
			node.setbnumber(bnumber);
			node.setCourses(courses);
			
			Node backup1=(Node) node.Clone();
			Node backup2=(Node) node.Clone();
			
			subject.insertNode(node);
			ob1.insertNode(backup1);
			ob2.insertNode(backup2);
			
			
		}
		catch(CloneNotSupportedException e)
		{
			System.err.println("CLONING NOT POSSIBLE");
			System.exit(1);
			
		}
	}
}