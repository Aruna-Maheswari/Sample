package controls;

public class lessthan50 {
	public static void main(String[] args)
	{
		int n=9,sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		if(sum<50)
		{
			System.out.println(sum);
		}
		else {
			System.out.println("it is greater than 50");
		}
	}

}
