package controls;
import java.util.*;
public class digichar {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a digit:");
		int digit=sc.nextInt();
		switch(digit)
		{
		case 0:
			System.out.println("zero digit");
			break;
		case 1:
			System.out.println("one digit");
			break;
		case 2:
			System.out.println("two digit");
			break;
		case 3:
			System.out.println("three digit");
			break;
		case 4:
			System.out.println("four digit");
			break;
		case 5:
			System.out.println("fifth digit");
			break;
		case 9:
			System.out.println("ninth digit");
			break;
		case 6:
			System.out.println("sixth digit");
			break;
		case 7:
			System.out.println("seventh digit");
			break;
		case 8:
			System.out.println("eight digit");
			break;
		default:
				System.out.println("Enter valid digit");
				
		}
		
		
	}

}
