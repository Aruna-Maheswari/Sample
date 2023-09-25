package Stringconceptprograms;
import java.util.*;
public class number7 {
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the String :");
		//String n = sc.nextLine();
		String n="Aruna";
		char ch[]=n.toCharArray();
		int i,j=0;
		char temp=0;
		
		for (i=0;i<n.length();i++)
		   {
		       for(j=0;j<n.length();j++)
		       {
		    	   if(ch[i]<ch[j])
		    	   {
		    		   temp = ch[i];
		    		   ch[i]=ch[j];
		    		   ch[j]= temp;
		    	   }
		       }
	       }
		System.out.println("The alphabetical order of a String is ");
		for(int a=0;a<ch.length;a++)
		{
			System.out.print(ch[a]);
		}
	}
}


