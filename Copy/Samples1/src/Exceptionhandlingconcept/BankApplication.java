package Exceptionhandlingconcept;
import java.util.*;
class WithdrawException extends Exception
{
	public WithdrawException(String s)
	{
		super(s);
	}
}
class DepositException extends Exception
{
	public DepositException(String s)
	{
		super(s);
	}
}
public class BankApplication {
	public static void deposit(int b) throws DepositException
	{
		if(b<100)
		{
			throw new DepositException("deposit amount should be greater than 500");
		}
		else
		{
			System.out.print("deposit amount:"+b);
		}
	}
	public static void withdraw(int a) throws WithdrawException
	{ 
		int bal=30000;
		if(bal<a)
		{
			throw new WithdrawException("insufficient");
		}
		else
		{
			System.out.println("withdrawal amount:"+a);
		}
	}

	public static void main(String args[]) {
		int b=0;
		int a=0;
		int bal=25000;
		while(true)
		{
		System.out.print("\n1.deposit"+"\n2.withdraw "+"\n3.checkbalance"+"\n4.exit");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch(n)
		{
		case 1:System.out.println("Withdraw amount:");
	       a=s.nextInt();
	       bal=bal-a;
         try
         {
 	       withdraw(a);
          }
       catch(WithdrawException e)
        {
 	 System.out.println(e);
       }
         break;
		case 2:System.out.println("Deposit amount:");
		         b=s.nextInt();
		         bal=bal+b;
		        try
		        {
		        	deposit(b);
		       }
		        catch(DepositException e)
		        {
		        	System.out.println(e);
		        }
		        break;
	
		case 3:System.out.println("Deposit amount:"+bal);
		break;
		case 4:System.exit(0);
		
		}

	}
	}
}

