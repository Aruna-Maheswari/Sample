package demospatterns;

public class printingseries {
	public static void main(String args[])
	{
		int n=3;double sum=0,sum3=0,sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			
				sum1=sum1+i/Math.pow(2, i);
			else
				sum2=sum2+i/Math.pow(2, i);
		}
		sum3=1+sum2-sum1;
		System.out.println(sum3);
	}

}
