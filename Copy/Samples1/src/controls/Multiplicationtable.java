package controls;
import java.util.*;
public class Multiplicationtable {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter n value:");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		int m=i*n;
		System.out.println(+n+" * "+i+" ="+m);
	}
	
	
	}
}	
	


