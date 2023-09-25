package Exceptionhandlingconcept;

public class Ex5 {
	
	void checkNum(int num) {
		
	   if (num < 1) {  
           throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
       }  
       else {  
           System.out.println("Square of " + num + " is " + (num*num));  
       }  
   } 

   //main method  
   public static void main(String[] args) {  
           Ex5 obj = new Ex5();  
           obj.checkNum(-6);  
           System.out.println("Rest of the code..");  
   } 
   }





