package demospatterns;

public class Printing1 {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			for(int k1=2;k1<=i;k1++)
			{
				System.out.print(j);
				//continue;
			}
			System.out.println();
		}
	}

}
