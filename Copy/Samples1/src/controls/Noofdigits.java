package controls;

public class Noofdigits {
	public static void main(String args[])
	{
		int n=435121,r=0,count=0;;
		while(n>0)
		{
			r=n%10;
			count++;
			n=n/10;
	
		}
		System.out.println(count);
	}

}
