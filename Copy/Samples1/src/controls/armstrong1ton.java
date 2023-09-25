package controls;

public class armstrong1ton {
	public static void main(String args[])
	{
		int n1,A=0,r;
		for(int i=1;i<=500;i++)
		{
			A=0;
			n1=i;
			while(n1>0)
			{
				r=n1%10;
				A=A+r*r*r;
				n1=n1/10;
			}
		
			if(i==A)
			{
				System.out.println(i);
			}
		
			
		}
	}
}


