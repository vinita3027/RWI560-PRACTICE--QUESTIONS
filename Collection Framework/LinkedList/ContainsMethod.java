package LinkedList;

import java.util.LinkedList;


public class ContainsMethod {
	public static void main(String[]args) {
		LinkedList<String> Name = new LinkedList<String>();
	
	Name.add("Preeti");
	Name.add("Vinni");
	Name.add("Srahsti");
	Name.add("Diya");
	System.out.println(Name);
	
	System.out.println(Name.contains("Preeti"));
	System.out.println(Name.contains("Riya"));
	
	
}
}
