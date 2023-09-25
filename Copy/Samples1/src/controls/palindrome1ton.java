package controls;

public class palindrome1ton {
	public static void main(String args[])
	{
		int n1=0,r,rev=0;
		for(int i=1;i<=200;i++)
		{
			rev=0;
			n1=i;
			while(n1>0)
			{
			 r=n1%10;
			 rev=rev*10+r;
			 n1=n1/10;
			if(rev==i)
			
				System.out.println(i);
			
	
	}
  
	}
}
}
