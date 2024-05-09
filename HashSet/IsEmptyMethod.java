package HashSet;

import java.util.HashSet;

public class IsEmptyMethod {
	public static void main(String[] args) {
		  HashSet<String> hs=new  HashSet<String>();
		  
		  System.out.println(hs.isEmpty()); 
		  hs.add("vinii");
		  hs.add("Preeti");
		  hs.add("aaru");
		  hs.add("pari");
		  hs.add("vira");
		  
		  System.out.println(hs);
		  System.out.println(hs.isEmpty());
	  }

}
