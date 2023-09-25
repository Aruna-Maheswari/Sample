package demos;

public class Swapping {
	public static void main(String args[])
	{
		int a=6,b=9;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:");
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
	}

}
