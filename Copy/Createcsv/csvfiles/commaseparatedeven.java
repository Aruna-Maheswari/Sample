package csvfiles;

public class commaseparatedeven {
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				if(i!=10)
				{
				System.out.print(i+",");
			}
				else
				{
					System.out.println(i);
				}
		}
	}

	}
}
