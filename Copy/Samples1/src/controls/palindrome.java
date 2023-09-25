package controls;

public class palindrome {
	public static void main(String args[])
	{
		int n=121,r,rev=0,n1;
		n1=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==n1)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
