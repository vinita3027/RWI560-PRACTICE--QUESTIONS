package LinkedList;

import java.util.LinkedList;

public class RemoveMethod {
    public static void main(String[]args) {
		LinkedList<String> Name = new LinkedList<String>();
		
		Name.add("Preeti");
		Name.add("Vinni");
		Name.add("Srahsti");
		Name.add("Diya");
		System.out.println(Name);
		
		Name.remove();
		System.out.println(Name);
    }

}
