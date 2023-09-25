package Exceptionhandlingconcept;
import java.util.*;
class Withdraw extends Exception
{
public Withdraw(String s)
{
super(s);
}
}
class Deposit extends Exception
{
public Deposit(String s)
{
super(s);
}
}
class Balance extends Exception
{
public Balance(String s)
{
super(s);
}
}
public class Bank1
{
static int balance=50000;
public static void withdraw(int a) throws Withdraw
{
if(a>balance)
{
System.out.println("Insufficient amount");
}
else
{
System.out.println("withdrawal amount:"+a);
}
}
public static void deposit(int b) throws Deposit
{
if(b<100)
{
throw new Deposit("deposit amount should be greater than 100");
}
else
{
balance+=b;
System.out.print("deposit amount:"+b);
}
}

public static void balance() throws Balance
{
Scanner s = new Scanner(System.in);
int pin = 12345;
System.out.print("Enter your pin: ");
int entry = s.nextInt();
           if(entry!=pin)
           {
System.out.println("\nIncorrect pin....please try again");
throw new Balance("Invalid Pin");
           }
           else
           {
          System.out.println("Ur Balance is "+balance);
           }
}
public static void main(String args[])
{
while(true)
{
System.out.println("\n1.Withdraw"+"\n2.Deposit "+"\n3.Balance"+"\n4.Exit");
System.out.println("============================");
Scanner s=new Scanner(System.in);
System.out.println("Enter Value");
int n=s.nextInt();
switch(n)
{
case 1:System.out.println("Withdraw amount:");
int a=s.nextInt();
balance=balance-a;
 try
  {
    withdraw(a);
    }
    catch(Withdraw e)
    {
    System.out.println(e);
  }
   break;
 case 2:
System.out.println("Deposit amount:");
   int b=s.nextInt();
try
{
deposit(b);
}
catch(Deposit e)
{
System.out.println(e);
}
break;
case 3:
try
{
               balance();
}
catch(Balance e)
{
System.out.println(e);
}
break;
case 4:
System.out.println("....Thank you....");
System.exit(0);

}

}
}
}





