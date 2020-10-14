package com.capgemini.mylinkedlist;

import org.junit.Assert;
import org.junit.Test;
public class MyStackTest
{
	@Test
	public void given3NumbersWhenAdded_ToStack_ShouldBeAddedToTop() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	MyStack myStack=new MyStack();
    	myStack.push(myFirstNode);
    	myStack.push(mySecondNode);
    	myStack.push(myThirdNode);
    	myStack.printStack();
    	myStack.peek();
    	INode peek=myStack.peek();
    	Assert.assertEquals(myThirdNode,peek);
	}
	@Test
	public void given3NumbersInStack_WhenPopped_ShouldGiveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> poppedNodeOne = myStack.pop();
		myStack.printStack();
		INode<Integer> poppedNodeTwo = myStack.pop();
		myStack.printStack();
		INode<Integer> poppedNodeThree = myStack.pop();
		Assert.assertEquals(myThirdNode, poppedNodeOne);
	}
}
