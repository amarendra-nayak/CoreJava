package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		//List allows us to have the "Null" value. But in case of reverseOrder() it is not.
		//================ArrayList========================================================
		//Creating a ArrayList
		ArrayList<String> list=new ArrayList<String>();
		
		//Adding Elements to list
		list.add("Amar");
		list.add("Swapna");
		list.add("Sipra");
		
		//Printing the elements from the list
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));//Printing the last element
		
		//Printing using for() loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Printing using for-each loop
		for(String data:list) {
			System.out.println(data);
		}
		
		//Printing using iterator and while() loop
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*Some inbuilt collections methods
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		*/
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//=========================LinkedList===============================================
		
		//For Array and ArrayList we have all the elements in contiguous manner but in case of
		//LinkedList its need not be contiguous
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Milan");
		list1.add("Somu");
		list1.add("Sonu");
		list1.addFirst("Jaga");
		list1.addLast("Banty");
		
		System.out.println(list1);
		
		
		//===========================Stack==================================================
		Stack<String> stack1=new Stack<String>();
		//PUSH()
		stack1.push("Amar");
		stack1.push("Mamata");
		stack1.push("Abhi");
		System.out.println(stack1);
		
		//POP()
		System.out.println(stack1.pop());
		System.out.println(stack1);
		
		//PEEK()
		System.out.println(stack1.peek()); //Peek() returns the top object of the stack
		
		//=============================Vector===================================================
		//Vector stores the data in an Synchronize way, but ArrayList and LinkedList 
		//stores data in asynchronous way. So we can use Vector when you have multi-threading.
		Vector<String> vec=new Vector<String>();
		vec.add("name1");
		vec.add("name2");
		vec.add("name3");
		System.out.println(vec);
		
		
		
		
		

	}

}
