package LinkedList;

import java.util.LinkedList;

public class indexOf {
	public static void main(String[]args) {
		LinkedList<String> Name = new LinkedList<String>();

	       Name.add("Preeti");
	       Name.add("Vinni");
	       Name.add("Srahsti");
	       Name.add("Diya");
	       System.out.println(Name);
	       
	       System.out.println("The index of Srahsti:"+ Name.indexOf("Srahsti")); 
           System.out.println("The index of Khushi: " + Name.indexOf("Khushi")); 


}
}
