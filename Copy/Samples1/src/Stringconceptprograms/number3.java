package Stringconceptprograms;

public class number3 {
	public static void main(String[] args) 
	{
		String str = "PQRS";
		String rev = "";
		 int len= str.length();
		 
		 for (int i=str.length()-1;i>=0;i--)
		 {
			 rev = rev+str.charAt(i);
		 }
		System.out.println("Reversed String is :" +rev);
	

	}

}



