package controls;

public class Fibonaccidemo {
	public static void main(String args[])
	{
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=12;i++)
		{
			//System.out.println(a);
			//System.out.println(b);
		    c=a+b;
		    System.out.println(c);
		    a=b;
		     b=c;
		   
		}
	}

}
