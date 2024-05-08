package ArrayDeque;
      
import java.util.ArrayDeque;

import java.util.Deque;

	public class RemoveMethod {
	    public static void main(String[]args) {
	    	
	    	 Deque<Integer> deque = new ArrayDeque<Integer>();  
	         deque.push(0); 
	         deque.push(1); 
	         deque.push(2); 
	         deque.push(3); 
	         deque.push(4); 
	    
	        System.out.println("ArrayDeque: " + deque);
	        
			deque.remove(0);
			System.out.println(deque);
		}

	}

