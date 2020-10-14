package com.capgemini.mylinkedlist;

public class MyLinkedList<K> 
{
	public INode head;
	public INode tail;
	public int size=0;
	public MyLinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(INode newNode) 
	{
    if(this.tail==null)
		this.tail=newNode;
    if(this.head==null)
		this.head=newNode;
    else
    	{
    	INode temporaryNode=this.head;
    	this.head=newNode;
    	this.head.setNext(temporaryNode);
    	}
    size++;
	}
	public void append(INode newNode) 
	{
    if(this.tail==null)
		this.tail=newNode;
    if(this.head==null)
		this.head=newNode;
    else
    	{
    	this.tail.setNext(newNode);
    	this.tail=newNode;
    	}
    size++;
	}
	public void insert(INode myNode,INode newNode)
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		size++;
	}
	public INode pop()
	{
		INode temporaryNode=this.head;
		this.head=head.getNext();
		size--;
		return temporaryNode;
	}
	public INode popLast()
	{
		INode temporaryNode=head;
		while(!temporaryNode.getNext().equals(tail))
			temporaryNode =temporaryNode.getNext();
		this.tail=temporaryNode;
		temporaryNode=temporaryNode.getNext();
		tail.setNext(null);
		size--;
		return temporaryNode;
	}
	public INode search(K key)
	{
		INode tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) 
		{
			if(tempNode.getKey().equals(key)) 
			{
				return tempNode;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		return null;
	}
	public INode searchKeyAndInsertNode(K key, INode newNode) {
		INode temporaryNode = head;
		while (temporaryNode != null && temporaryNode.getNext() != null) {
			if (temporaryNode.getKey().equals(key)) {
				break;
			} else
				temporaryNode = temporaryNode.getNext();
		}
		INode tempNode2 = temporaryNode.getNext();
		temporaryNode.setNext(newNode);
		newNode.setNext(tempNode2);
		size++;
		return temporaryNode;
	}
	public INode searchKeyAndRemove(K key) {
		INode tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) {
			if(tempNode.getNext().getKey().equals(key)) {
				break;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		tempNode.setNext(tempNode.getNext().getNext());
		size--;
		return tempNode;
	}
	public int size()
	{
		return size;
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
