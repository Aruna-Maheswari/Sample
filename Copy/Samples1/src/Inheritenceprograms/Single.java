package Inheritenceprograms;

public class Two  {
	int a=3;

	void display()
	{
		System.out.println("hello");
	}
}
class Single  extends Two
{
	int a=7;
	public static void main(String args[])
	{
		Single  a=new Single ();
		a.display();
	
	}
}

