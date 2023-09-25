package controls;

public class Divsquare {
	public static void main(String args[])
	{
		double i,sum=0.0,n=5;
		for(i=0;i<=n;i++)
		{
			sum=sum+(1/Math.pow(2,i));
			
		}
		System.out.println(sum);
		
	}

}
