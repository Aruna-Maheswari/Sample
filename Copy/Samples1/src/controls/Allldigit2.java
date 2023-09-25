package controls;
import java.util.*;
public class Allldigit2 {
	public static void main(String args[])
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
         while(n>0)
		 {
			r=n%10;
			if(r==n)
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
			
		}
		
		
	}

}
