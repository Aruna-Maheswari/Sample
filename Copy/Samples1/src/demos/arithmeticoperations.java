package demos;

public class arithmeticoperations {
	int a=10,b=5,c;
	void add()
	{
		c=a+b;
		System.out.println(c);
		
	}
	void sub()
	{
		c=a-b;
	}
	void mul()
	{
		c=a*b;
		System.out.println(c);
		
	}
	void div()
	{
		c=a/b;
		System.out.println(c);
	}
	void mod()
	{
		c=a%b;
		System.out.println(c);
	}
	public static void main(String args[])
	{ 
		arithmeticoperations n=new arithmeticoperations();
		n.add();
		n.sub();
		n.div();
	
		n.mul();
		n.mod();
		
	}

}
