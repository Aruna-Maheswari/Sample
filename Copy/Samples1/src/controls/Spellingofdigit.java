package controls;
import java.util.*;
public class Spellingofdigit {
	public static void main(String args[])
	{
		int r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			//rev=rev*10+r;
			n=n/10;
			
		}
		while(rev>0)
		{
			rev=rev%10;
	   switch(rev)
		{
		case 0:
			System.out.println("zero");
			//rev=rev/10;
			break;
		case 1:
			System.out.println("one");
			//rev=rev/10;
			break;
		case 2:
			System.out.println("two");
			//rev=rev/10;
			break;
		case 3:
			System.out.println("three");
			//rev=rev/10;
			break;
		case 4:
			System.out.println("four");
			//rev=rev/10;
			break;
		case 5:
			System.out.println("five");
			//rev=rev/10;
			break;
		case 6:
			System.out.println("six");
			//rev=rev/10;
			break;
		case 7:
			System.out.println("seven");
			//rev=rev/10;
			break;
		case 8:
			System.out.println("eight");
			//rev=rev/10;
			break;
		case 9:
			System.out.println("nine");
			//rev=rev/10;
			break;
			default:
				System.out.println("entar a valid number");
				
		}
	   
		}
		rev=rev/10;
		
	}
}