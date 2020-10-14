package com.capgemini.mylinkedlist;

public class MyQueue 
{
	private MyLinkedList myLinkedList;
	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	public INode peek() {
		return myLinkedList.head;
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNode();
	}
}
