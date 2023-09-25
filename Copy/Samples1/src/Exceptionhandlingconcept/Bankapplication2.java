package Exceptionhandlingconcept;
import java.util.*;
class userException extends Exception
{
	public userException(String s)
	{
		super(s);
	}
}

public class Bankapplication2 {
	public static void main(String args[])
	{
		
			
		
		 int balance=25000;
		Scanner sc=new Scanner(System.in);
		int id=12221;
		while(true)
		{
		System.out.println("Enter your choice: ");
		int n=sc.nextInt();
		
		
		switch(n)
		{
		case 1:
			System.out.println("enter withdraw amount:");
			int wa=sc.nextInt();
			try
			{
				if(wa>balance)
				{
					throw new userException("balance is insufficient");
				}
				else
				{
					int fn=balance-wa;
					balance-=wa;
					System.out.println("withdraw success");
					System.out.println("final balance after withdraw is:"+fn);
				}
			}
			catch(userException e)
			{
				System.out.println(e);
			}
			break;
		case 2:
			System.out.println("Enter deposit amount:");
			int da=sc.nextInt();
			try
			{
				if(da<100)
				{
					throw new userException("deposit amount is lessthan 100");
				}
				else
				{
					int fa1=da+balance;
					System.out.println("deposit success");
					System.out.println("Total amount after deposit:"+fa1);
					fa1=balance;
				}
			}
			
				catch(userException ex)
				{
					System.out.println(ex);
				}
			break;
		case 3:
			System.out.println("Enter id:");
			int id1=sc.nextInt();
			try
			{
				if(id!=id1)
				{
					throw new userException("pin is mismatch");
				}
				else
				{
					System.out.println("final balance is:"+balance);
				}
			}
			catch(userException exe)
			{
				System.out.println(exe);
			}
			break;
		
		case 4:
			System.out.println("*****thanks for using****");
			System.exit(0);
			default:
				System.out.println("invalid");
			
		}
	}

	
}
}
