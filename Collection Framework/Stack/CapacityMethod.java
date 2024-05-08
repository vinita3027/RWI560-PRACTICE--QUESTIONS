package Stack;
import java.util.Stack;

public class CapacityMethod {
   
	public static void main(String args[]) 
    { 
        Stack<String> stack = new Stack<String>(); 
  
        stack.push("Preeti"); 
        stack.push("Riya"); 
        stack.push("Diya"); 
        stack.push("Vinni"); 
        stack.push("Siya"); 
 
        System.out.println("The Stack is: " + stack); 
 
        System.out.println("Capacity: " + stack.capacity()); 
    } 
}
