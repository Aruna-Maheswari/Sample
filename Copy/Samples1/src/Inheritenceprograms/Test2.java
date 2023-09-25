package Inheritenceprograms;
class D
{
	int a=10;
	void display()
	{
		
		System.out.println("mahe");
	}
}
class N extends D
{
	void play()
	{
		System.out.println("Aruna");
	}
}
class C extends N
{
	int a=3;
	void show()
	{
		System.out.println("pidugu");
	}
}
public class Test2 {
	public static void main(String args[])
	{
		C n=new C();
		n.play();
		n.show();
		n.display();
		System.out.println(n.a);
	
	}

	
}
