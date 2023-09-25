package Stringconceptprograms;
import java.util.*;
public class number6 {
	public static void main(String[] args) 
	{
		int i=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String n = s.nextLine();
		char ch[]=n.toCharArray();
		for(char a:ch)
		{
			i++;
		}
		System.out.println("The length of the string is :" +i);

	}

}



