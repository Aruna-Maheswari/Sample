package controls;

public class Perfect {
	public static void main(String args[])
	{
		int n=7,fact=0,n1;
		//n1=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				fact=fact+i;
			}
		
		}
		if(n==fact)
		{
			System.out.println(+n+ " is a perfect no");
		}
		else
		{
			System.out.println(+n+ "is not a perfect no");
		}
		
	}

}


