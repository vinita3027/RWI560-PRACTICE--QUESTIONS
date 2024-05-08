package ArrayyList;

import java.util.ArrayList;

public class ContainsMethod {
	public static void main(String[]args) {
		ArrayList<String> Name = new ArrayList<String>();
	
	Name.add("Preeti");
	Name.add("Vinni");
	Name.add("Srahsti");
	Name.add("Diya");
	System.out.println(Name);
	
	boolean ans = Name.contains("Preeti");
	
	if(ans)
		System.out.println("The list Contains Preeti");
	else
		System.out.println("The list does not Contains Preeti");
	
	ans = Name.contains("Riya");
	
	if(ans)
		System.out.println("The list Contains Riya");
	else
		System.out.println("The list does not Contains Riya");	
			
}
}