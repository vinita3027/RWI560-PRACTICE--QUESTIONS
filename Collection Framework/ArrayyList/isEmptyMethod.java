package ArrayyList;

import java.util.ArrayList;

public class isEmptyMethod {
	public static void main(String[]args) {
   
    ArrayList<Integer>ArrayList = new ArrayList<Integer>(10); 
   
    if(ArrayList.isEmpty()) {
    	System.out.println("ArrayList is empty");
    } else {
    	System.out.println("ArrayList is not empty");
    }
    System.out.println("ArrayList = " + ArrayList);
    
    ArrayList.add(10); 
    ArrayList.add(20); 
    ArrayList.add(30); 
    ArrayList.add(40); 
    ArrayList.add(50); 
    
    if (ArrayList.isEmpty()) {
        System.out.println("ArrayList is empty");
     } else {
        System.out.println("ArrayList is not empty");
     }
     System.out.println("ArrayList = " + ArrayList);
  }
   
    
	}