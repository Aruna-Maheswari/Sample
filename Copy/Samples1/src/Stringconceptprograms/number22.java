package Stringconceptprograms;
import java.util.*;
public class number22 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String : ");
		String n = sc.nextLine();
		System.out.println("character of the string :"+n.length());
		int count=1,i;
		for(i=0;i<n.length();i++)
		{
			if((n.charAt(i)==' ') && (n.charAt(i+1)!=' '))
			{
				count++;
			}
		}
			System.out.println("Number of words in a string :" +count);
		}
	
	}




