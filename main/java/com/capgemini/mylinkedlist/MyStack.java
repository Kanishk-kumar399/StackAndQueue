package com.capgemini.mylinkedlist;

public class MyStack 
{
	private MyLinkedList myLinkedList;
	public MyStack()
	{
		this.myLinkedList=new MyLinkedList();
	}
	public void push(INode myNode)
	{
		myLinkedList.add(myNode);
	}
	public void printStack() {
		myLinkedList.printMyNode();
		
	}
	public INode peek() {
		return  myLinkedList.head;
	}
	public INode pop()
	{
		return myLinkedList.pop();
	}
}
