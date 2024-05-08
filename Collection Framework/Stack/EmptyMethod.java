package Stack;

import java.util.Stack;

public class EmptyMethod {
	 public static void main(String[] args)
	    {
	 
	        Stack<String> STACK = new Stack<String>();
	 
	        STACK.push("Preeti");
	        STACK.push("Vinni");
	        STACK.push("Krishna");
	        STACK.push("Khushi");
	        STACK.push("paree");
	 
	        System.out.println("The stack is: " + STACK);
	 
	        System.out.println("The stack is empty? " +STACK.empty());
	 
	        STACK.pop();
	        STACK.pop();
	        STACK.pop();
	        STACK.pop();
	        STACK.pop();
	 
	        System.out.println("Is the stack empty? " +STACK.empty());
	    }
	}
