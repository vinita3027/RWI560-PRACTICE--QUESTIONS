package HashSet;

import java.util.HashSet;

public class ClearMethod {
		  public static void main(String[] args) {
			  HashSet<String> hs=new  HashSet<String>();
			   
			  hs.add("vinii");
			  hs.add("Preeti");
			  hs.add("aaru");
			  hs.add("pari");
			  hs.add("vira");
			  
			  System.out.println(hs);
			  hs.clear();
			  System.out.println(hs);
		  }
		}

