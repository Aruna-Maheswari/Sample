package controls;

public class Armstrongno {
	public static void main(String args[])
	{
		int n=153,r,arm=0,n1;
		n1=n;
		while(n>0)
		{
			r=n%10;
			arm=arm+r*r*r;
			n=n/10;
		}
		if(arm==n1)
		{
			System.out.println(+n1+ " is a armstromg number");
		}
		else
		{
			System.out.println(+n1+ " is a not an armstromg number");
		}
	}

}
