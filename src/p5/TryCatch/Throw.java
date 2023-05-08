package p5.TryCatch;

public class Throw {
		   static void validate_Age(int age){  
		     //if specified age is &lt; 18, throw ArithmeticException
		     if(age<18)  
		      throw new ArithmeticException("Not eligible to vote and drive!!");  
		     else   //print the message
		      System.out.println("Eligible to vote and drive!!");  
		   }  
		   public static void main(String args[]){  
		      //call validate_Age method
		      validate_Age(18);  
		      System.out.println("rest of the code...");  
		  }  
		}  

