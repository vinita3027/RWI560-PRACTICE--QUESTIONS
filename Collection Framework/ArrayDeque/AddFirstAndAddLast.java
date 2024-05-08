package ArrayDeque;

import java.util.ArrayDeque;

public class AddFirstAndAddLast {

	 public static void main(String[] args) {
		 ArrayDeque<Integer> deque = new ArrayDeque<>();
	        deque.add(1);
	        deque.add(2);
	        deque.add(10);
	        deque.add(20);
	        
	        System.out.println(deque);
	        
	        deque.addFirst(0);  
	        deque.addLast(100); 
	        
	        System.out.println("Adding first and last: " + deque);
	    }
	}
