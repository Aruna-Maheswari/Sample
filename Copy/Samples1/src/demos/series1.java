package demos;

public class series1 {
	public static void main(String args[])
	{
		double sum=0;
		for(int i=1,a=1;i<=5;i++,a++)
		{
			if(a%2==0)
				
			   sum=sum+(1/a);
		     
			else 
			
				sum=sum-(1/a);
		}
			System.out.println(sum);
	}

}
