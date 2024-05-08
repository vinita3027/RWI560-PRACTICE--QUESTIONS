package ArrayyList;

import java.util.ArrayDeque;


public class AddAllMethod {
	public static void main(String args[])throws Exception { 
	  
		    ArrayDeque<Integer> ArrayDeque1 = new ArrayDeque<Integer>(); 
		    ArrayDeque1.add(12); 
		    ArrayDeque1 .add(20); 
		    ArrayDeque1 .add(45); 
	  
	        System.out.println("Printing ArrayDeque1:"); 
	        for (Integer number : ArrayDeque1 )  
	            System.out.println("Number = " + number);         
	  
	        ArrayDeque<Integer> ArrayDeque2 = new ArrayDeque<Integer>(5); 
	  
	        ArrayDeque2.add(25); 
	        ArrayDeque2.add(30); 
	        ArrayDeque2.add(31); 
	        ArrayDeque2.add(35); 

	        System.out.println("Printing ArrayDequelist2:"); 
	        for (Integer number : ArrayDeque2)  
	            System.out.println("Number = " + number);        
	        ArrayDeque2 .addAll(ArrayDeque2); 
	  
	        System.out.println("Printing all the elements"); 
	   
	        //for (Integer number : ArrayDeque2 )  
	          //  System.out.println("Number = " + number);         
	    } 
	} 
