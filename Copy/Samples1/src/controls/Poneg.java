package controls;
import java.util.*;
public class Poneg 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println(+n+" is a positive number");
		}
		else
		{
			System.out.println(+n+ "is a negative number");
		}
	}

}
