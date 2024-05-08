package ArrayDeque;

import java.util.ArrayDeque;

public class RemoveFirstAndLast {

		 public static void main(String[] args) {
			    ArrayDeque<Integer> deque = new ArrayDeque<>();
			    deque.addFirst(1);
			    deque.addLast(2);
			    deque.addFirst(10);
			    deque.addLast(20);
			    
			    System.out.println(deque);
			    
			    int first = deque.removeFirst();
			    int last = deque.removeLast();
			    System.out.println("First: " + first + ", Last: " + last);
			  }
			}