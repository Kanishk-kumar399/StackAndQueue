package com.capgemini.mylinkedlist;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;
public class MyQueueTest
{
	@Test
	public void given3Numbers_WhenAddedIntoQueue_ShouldHaveLastAddedNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode<Integer> myNode = myQueue.peek();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, myNode);
	}
}
