package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		//"NULL" values are not allowed in Queue.
		//=========================PriorityQueue==========================================
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("name1");
		queue1.add("name2");
		queue1.add("name3");
		queue1.add("name4");
		queue1.add("name5");
		
		System.out.println(queue1);
		
		System.out.println(queue1.peek());
		System.out.println(queue1.poll());
		//Poll will pick the top element of queue and return that and will remove that from the top of the queue
		
		System.out.println(queue1);
		
		
		//=============================Dequeue============================================
		ArrayDeque<String> queue2=new ArrayDeque<String>();
		queue2.add("name1");
		queue2.add("name2");
		queue2.add("name3");
		queue2.add("name4");
		queue2.addFirst("name5");
		queue2.addLast("name6");
		
		System.out.println(queue2);
		
		System.out.println(queue2.peekFirst());
		System.out.println(queue2.peekLast());
		System.out.println(queue2);
		
		System.out.println(queue2.pollFirst());
		System.out.println(queue2.pollLast());
		System.out.println(queue2);
		
		

	}

}
