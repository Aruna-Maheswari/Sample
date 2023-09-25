package demospatterns;
import java.util.*;
public class alternates {
	public static void main(String args[])
	{
		int n,r;
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[56];
		int i=0,count=0,sum=0;
		while(n>0)
		{
			r=n%10;
			a[i]=r;
			i++;
			count++;
			n=n/10;
			
		}
		for(int j=1;j<count;j=j+2)
		{
			sum=sum+a[j];
		}
		System.out.println(sum);
	}

}
