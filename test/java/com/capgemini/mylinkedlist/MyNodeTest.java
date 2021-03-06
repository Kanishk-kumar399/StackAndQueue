package com.capgemini.mylinkedlist;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyNodeTest 
{
    @Test
    public void given3NumbersWhenLinked_ShouldPass_LinkedListTest()
    {
    	MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	myFirstNode.setNext(mySecondNode);
    	mySecondNode.setNext(myThirdNode);
    	boolean result=myFirstNode.getNext().equals(mySecondNode)&&
    					mySecondNode.getNext().equals(myThirdNode);
        assertTrue( result );
    }
}
