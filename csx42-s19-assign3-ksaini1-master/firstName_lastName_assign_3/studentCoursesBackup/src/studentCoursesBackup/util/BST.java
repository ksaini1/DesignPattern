package studentCoursesBackup.util;
import studentCoursesBackup.myTree.Node;

public class BST {
public Node root;
public Results results;
public boolean flag;

public BST()
{
	root=null;
	flag=true;
	setResults(null);
	
}
public BST(Results result)
{
root=null;
flag=true;
setResults(result);
}
public void setResults(Results results) {
	// TODO Auto-generated method stub
	this.results=results;
}
public void  setNode(Node node)
{
this.root=node;	
}
public void printNodes(Results resultinsert)
{
Node storeResult=root;
printNodes(resultinsert,storeResult);
}
public void printNodes(Results resultinsert,Node storeResult)
{	StringBuilder cc=new StringBuilder();
	if(storeResult!=null) 
	{
	String courses=storeResult.courses.toString();
	courses=courses.replaceAll("\\[", "");
	courses=courses.replaceAll("\\]", "");
	courses=courses.replaceAll(",", "");
	resultinsert.storeNewResult(storeResult.bnumber+ " : "+courses);
		printNodes(resultinsert,storeResult.left);
	printNodes(resultinsert,storeResult.right);
	cc.append(courses);
	}	
}
public void insertNode(Node nodeinsert)
{
	if(root==null)
		{
		root=nodeinsert;
		return;
		
		}
	Node temp=root;
	while(temp!=null)
	{
		if(temp.bnumber > nodeinsert.bnumber)
		{
			if(temp.left!=null)
			{
				temp=temp.left;
			}
			else
			{
				temp.setleft(nodeinsert);
				break;
			}
		}
		else if(temp.bnumber<nodeinsert.bnumber)
		{
			if(temp.right!=null)
			{
				temp=temp.right;
				
			}
			else
			{
				temp.setright(nodeinsert);
				break;
			}
			
		}
		else {
			if(!temp.courses.contains(nodeinsert.courses.get(0)))
			{
				temp.addCourse(nodeinsert.courses,temp);
			}
			break;			
			}
		
	} return;
}

}
