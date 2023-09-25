package controls;
import java.util.*;
public class Noofoccurences {
	public static void main(String args[])
	{
		int r,n,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    n=sc.nextInt();
		System.out.println("enter a digit:");
		 d=sc.nextInt();
		 int count=0;
		while(n>0)
		{
			
			r=n%10;
			if(r==d)
			{
				count=count+1;
			}
			n=n/10;
		}
		System.out.println(count);
	}

}

