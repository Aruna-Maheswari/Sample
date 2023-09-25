package Exceptionhandlingconcept;

public class Ex2 {
public static void main(String args[])
{
	int a=10,b=0;
	try
	{
		System.out.println(a);
		
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
