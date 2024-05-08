package Stack;

import java.util.Stack;

public class peekMethod {
	public static void main(String[]args) {
		Stack<String> s1 = new Stack<>();
		   
		s1.push("Preeti");
		s1.push("Vinni");
		s1.push("Srasti");
		s1.push("Khushi");
		s1.push("Paree");
		s1.push("Krishna");
		
		System.out.println(s1);
		
		s1.peek();
	    System.out.println(s1.peek());
				
		

}
}
