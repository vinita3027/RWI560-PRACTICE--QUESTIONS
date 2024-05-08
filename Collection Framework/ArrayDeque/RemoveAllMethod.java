package ArrayDeque;
    
import java.util.ArrayDeque;

import java.util.Deque;

public class RemoveAllMethod{

		    public static void main(String[]args) {
		    	
		    	 Deque<Integer> deque = new ArrayDeque<Integer>();  
		         deque.push(0); 
		         deque.push(1); 
		         deque.push(2); 
		         deque.push(3); 
		         deque.push(4); 
		    
		        System.out.println("ArrayDeque: " + deque);
		        
		        deque.removeAll(deque);
				System.out.println(deque);
		    }

		}

