package controls;
import java.util.*;
public class calculator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU DRIVEN CALCULATOR");
		System.out.println("enter an operation to perform task:");
	    char ch=sc.next().charAt(0);
	    System.out.println("enter a value:");
	    int a=sc.nextInt();
	    System.out.println("enter b value:");
	    int b=sc.nextInt();
	    
	    switch(ch)
	    {
	    case '+':
	    	int d=a+b;
	    	System.out.println(d);
	    	break;
	    case '-':
	    	int e=a-b;
	    	System.out.println(e);
	    	break;
	    case '*':
	    	int f=a*b;
	    	System.out.println(f);
	    	break;
	    case '/':
	    	int g=a/b;
	    	System.out.println(g);
	    	break;
	    case '%':
	    	int h=a%b;
	    	System.out.println(h);
	    	break;
	   default:
	    		System.out.println("invalid operation");
	    
	    }
		
		
	}

}
