package p5.Exception;

import java.util.InputMismatchException;

public class MainException {
	 public static void main(String args[])  
	    {  
		 CustomException ce=new CustomException();
		 ce.show();
	        try  
	        {  
	        	String myStr = null; 
	            //print the string
	            System.out.println(myStr.length()); 
	           
	            // throw an object of user defined exception  
	            throw new CustomException();  
	        }  
	        catch(InputMismatchException e) {
	        	System.out.println("Invalid input");
	        }
	        catch (CustomException e)  
	        {  
	            System.out.println("Caught the exception");  
	            System.out.println(e.getMessage());  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
}
