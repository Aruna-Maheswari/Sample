package controls;
import java.util.*;
public class UldSchar {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("It is upper case letter");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("It is lowercase");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("It is digit");
		}
		else
		{
			System.out.println("it is a special character");
		}
	}

}
