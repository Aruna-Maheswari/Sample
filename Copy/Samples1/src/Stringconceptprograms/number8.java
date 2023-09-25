package Stringconceptprograms;
import java.util.*;
public class number8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str= sc.nextLine();
		str = str.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(str);
		

	}

}


