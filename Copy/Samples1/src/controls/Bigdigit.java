package controls;

public class Bigdigit {
	public static void main(String args[])
	{
		int j=3845,big=0,r=0;
		while(j>0)
		{
			r=j%10;
			if(r>big)
				big=r;
		    j=j/10;
		}
		System.out.println("Big digit"+big);
			
		}
		
		
	}


