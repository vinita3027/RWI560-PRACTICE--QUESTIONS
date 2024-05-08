package Stack;

import java.util.Stack;


public class SearchMethod {
	 public static void main(String[] args) 
	    { 
	 
	        Stack<String> STACK = new Stack<String>(); 
	  
	        STACK.push("Preeti"); 
	        STACK.push("21"); 
	        STACK.push("ABCD"); 
	        STACK.push("0"); 
	        STACK.push("abcd"); 
	  
	        System.out.println("The stack is: " + STACK); 
	  
	        System.out.println("Does the stack contains '21'? " + STACK.search("21")); 
	        System.out.println("Does the stack contains 'Preeti'? "+ STACK.search("Preeti")); 
	  
	        System.out.println("Does the stack contains 'abcd'? "+ STACK.search("abcd")); 
	    } 
	} 