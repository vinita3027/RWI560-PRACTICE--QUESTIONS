package HashMap;

import java.util.HashMap;

public class IsEmptyMethod {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		 System.out.println(map.isEmpty());
		   map.put(1,"Vinita");  
		   map.put(2,"Preeti");    
		   map.put(3,"Srashati");   
		   map.put(4,"Aaru");   
		     
		   System.out.println("Iterating Hashmap:"+map);  
		   System.out.println(map.isEmpty());
		   
		   }  
	}
