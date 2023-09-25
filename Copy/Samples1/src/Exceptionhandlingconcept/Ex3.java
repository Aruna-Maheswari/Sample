package Exceptionhandlingconcept;

public class Ex3 {
	public static void main(String args[])
	{
		int a=10,b=0;
		int c[]=new int[5];
		try
		{
			int d=a/b;
			//System.out.println(c[6]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());;;
		}
		try 
		{
			
			System.out.println(c[6]);
		}
		
		//catch(ArrayIndexOutOfBoundsException af)
		//{
			//System.out.println(af.getMessage());
		//}
		catch(Exception e)
		{
			System.out.println("jagadeesh");
		}
		finally
		{
			System.out.println(c[6]);
		}
	}
	

}
