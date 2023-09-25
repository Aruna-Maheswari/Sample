package controls;
import java.util.*;
public class Alldigitsequal {
	public static void main(String args[])
	{
		int r,n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		int count=0;
		n1=n;
		while(n>0)
		{
			r=n%10;
			count=count*10+r;
			n=n/10;
		}
		if(count==n1)
		{
			System.out.println("All are equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
