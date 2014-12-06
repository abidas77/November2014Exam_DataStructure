package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ApplyDS {

	public static void main(String[] args) {
		/*
		 * UseStructure can be applied here to demonstrate how to add and
		 * retrieve.
		 */

		UseStructure usobj = new UseStructure();
		System.out.println("output of Linked List");
	//Functinality of Linked List..........
		// add Value first
		usobj.addByLinkedList("Hello");
		// add Value second
		usobj.addByLinkedList("Hi");
		// add Value three
		usobj.addByLinkedList("How");
		// add Value fourth
		usobj.addByLinkedList("You");
		// Get values returnByLinkedList
		List<String> l1 = usobj.returnByLinkedList();
		// print All values
		System.out.print("" + l1);

		System.out.println("\noutput of Array List");
		///*Functionality of Array List
		UseStructure usobjarraylist = new UseStructure();
		usobjarraylist.addByArrayList("Hello");
		usobjarraylist.addByArrayList("How");
		usobjarraylist.addByArrayList("R");
		usobjarraylist.addByArrayList("U");
		ArrayList<String> l2 = usobjarraylist.returnByArrayList();
		System.out.print("" + l2);
		
		System.out.println("\noutput of Stack");
		//Functionality of Stack 
		UseStructure usobjstack = new UseStructure();
		usobjstack.addByStack("My");
		usobjstack.addByStack("Name");
		usobjstack.addByStack("is");
		usobjstack.addByStack("STACK");
		Stack<String> st = usobjstack.returnByStack();
		System.out.print("" + st);
		
		System.out.println("\noutput of Queue");
		//Functionality of Queue 
		UseStructure usobjqueue = new UseStructure();
		usobjqueue.addByQueue("My");
		usobjqueue.addByQueue("Name");
		usobjqueue.addByQueue("is");
		usobjqueue.addByQueue("QUEUE");
		Queue<String> qt = usobjqueue.returnByQueue();
		System.out.print("" + qt);
		
		
	}

}
