package Inheritenceprograms;
class Parent
{
	int a=3,b=8;
	void add()
	{
		
		System.out.println(a+b);
	}
}
class child extends Parent
{
	void sub()
	{
		System.out.println(a-b);
	}
}
class child1 extends Parent
{
	void mul()
	{
		System.out.println(a*b);
	}
}
public class Test3 {
	public static void main(String args[])
	{
	  child t=new child();
	  child1 w=new child1();
	  t.sub();
	  w.mul();
	  t.add();
	   
	}

}
