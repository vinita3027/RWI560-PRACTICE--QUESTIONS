package ArrayyList;

import java.util.ArrayList;

	public class RemoveMethod {
	    public static void main(String[]args) {
			ArrayList<String> Name = new ArrayList<String>();
			
			Name.add("Preeti");
			Name.add("Vinni");
			Name.add("Srahsti");
			Name.add("Diya");
			System.out.println(Name);
			
			Name.remove("Vinni");
			System.out.println(Name);
		}

	}