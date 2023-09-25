package controls;
import java.util.*;
public class firstlastdigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int fd=0,ld=0,c;
        ld=n%10;
        while(n>0)
        {
        	fd=n%10;
        	n=n/10;
        }
        c=ld+fd;
        System.out.println(c);
			
		
		
		
		
	}

}
