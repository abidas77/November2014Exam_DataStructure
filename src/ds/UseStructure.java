package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class UseStructure {
	
	LinkedList<String> list = new LinkedList<String>();
	ArrayList<String> arrayList = new ArrayList<String>();
	Stack<String> stack = new Stack<String>();
	Queue<String> queue = new LinkedList<String>();
	
	//add data into the LinkedList
	public void addByLinkedList(String name){
		list.add(name);
		
	}
	//Retrieve data and return the LinkedList
	public List<String> returnByLinkedList(){
	
			
	return list;
			
	}
	
	//add data into the ArrayList
	public void addByArrayList(String name){
		arrayList.add(name);
		 
			
	}
	//Retrieve data and return the ArrayList
	public ArrayList<String> returnByArrayList(){
		
				
	return arrayList;
				
	}
	//add data into the Stack
	public void addByStack(String name){
		stack.push(name);
			 
				
	}
	//Retrieve data and return as Stack order
	public Stack<String> returnByStack(){
			
					
	return stack;
					
	}
	//add data in Queue order
	public void addByQueue(String name){
		queue.add(name);
			 
				
	}
	//Retrieve data and return in Queue order
	public Queue<String> returnByQueue(){
			
					
	return queue;
					
	}
		
}
