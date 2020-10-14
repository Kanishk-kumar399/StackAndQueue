package com.capgemini.mylinkedlist;

public class MySortedLinkedList
{
	public INode head;
	public INode tail;
	public int size=0;
	public MySortedLinkedList() {
		this.head = null;
		this.tail = null;
	}	
	public void addSorted(INode newNode) 
	{
		INode tempNode=head;
		if (head == null || ((Comparable) head.getKey()).compareTo(newNode.getKey()) >= 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else
		{
			while (tempNode.getNext() != null && ((Comparable) tempNode.getNext().getKey()).compareTo(newNode.getKey()) < 0) 
			{
				tempNode = tempNode.getNext();
				newNode.setNext(tempNode.getNext());
				tempNode.setNext(newNode);
			}
		}

	}
	public void printMyNode()
	{
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode temporaryNode=head;
		while(temporaryNode.getNext()!=null)
		{
			myNodes.append(temporaryNode.getKey());
			if(!temporaryNode.equals(tail))
				myNodes.append("->");
			temporaryNode=temporaryNode.getNext();
		}
		myNodes.append(temporaryNode.getKey());
		System.out.println(myNodes);
	}
}
