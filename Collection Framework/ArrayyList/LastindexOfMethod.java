package ArrayyList;

import java.util.ArrayList;

public class LastindexOfMethod {
	public static void main(String[]args) {
		ArrayList<String> Name = new ArrayList<String>();

	       Name.add("Preeti");
	       Name.add("Vinni");
	       Name.add("Srahsti");
	       Name.add("Diya");
	       Name.add("Srahsti");
	       System.out.println(Name);
	       
	       System.out.println("The Lastindex of Srahsti:"+ Name.lastIndexOf("Srahsti")); 
           System.out.println("The Lastindex of Khushi: " + Name.lastIndexOf("Khushi")); 


}
}
