package controls;

public class Divfact {
	public static void main(String args[])
	{
		int fact=1,n=2,x=3;
		double sum=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			sum=sum+Math.pow(x,i)/fact;
		}
		System.out.println(sum);
	}

}
