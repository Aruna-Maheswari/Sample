package Inheritenceprograms;
 class A
{
	int a=9;
	void display()
	{

		System.out.println("hello");
	}
}
class B extends A
{
	int a=8;
}
public class Test1 {
	
	public static void main(String args[])
	{
		B a=new B();
		a.display();
		System.out.println(a.a);
	}
	   
	

}
