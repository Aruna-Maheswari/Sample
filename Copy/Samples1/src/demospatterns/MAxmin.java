package demospatterns;

public class MAxmin {
	public static void main(String args[])
	{
		int r,min=10,max=0;
		int x[]= {123,45,89,345};
		for(int i=0;i<x.length;i++)
		{
			int n=x[i];
			while(n>0)
			{
				r=n%10;
				if(r<min) 
				{
					min=r;
				}
				if(r>max) 
				{
					max=r;
					
				}
				n=n/10;
			}
			System.out.println(max);
			System.out.println(min);
		}
	}

}
