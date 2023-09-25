package controls;

public class Primeupton {
	public static void main(String args[])
	{
		int n=10,i;
	
	for(i=1;i<=n;i++)
	{   int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count=count+1;
			}
		}
	
		if(count==2)
		{
			System.out.println(i);
		}
	}
	}

}

