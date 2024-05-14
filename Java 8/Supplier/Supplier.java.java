package JDK8;

import java.util.function.Supplier;

public class Test {
	
	    public static void main(String[] args) {
	        // Creating a Supplier to provide the current date and time
	        Supplier<String> dateTimeSupplier = () -> java.time.LocalDateTime.now().toString();
	        
	        // Getting and printing the current date and time
	        String currentDateTime = dateTimeSupplier.get();
	        System.out.println("Current Date and Time: " + currentDateTime);
	    }
	}

