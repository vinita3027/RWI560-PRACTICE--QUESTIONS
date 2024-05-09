package HashMap;

import java.util.HashMap;

public class RemoveMethod {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		 
		   map.put(1,"Vinita");  
		   map.put(2,"Preeti");    
		   map.put(3,"Srashati");   
		   map.put(4,"Aaru");   
		     
		   System.out.println("Iterating Hashmap:"+map);  
		   System.out.println(map.remove(2));
		   System.out.println("After Removing:"+map);  
		   
		   
		   }  
	}