package demo2;

class Class4  {
	protected void a()
	{
		System.out.println("hell");
	}

}
class Class5
{
	void display()
	{
		System.out.println("mahe");
	}
}
public class Class3
{
	public static void main(String args[])
	{
		Class5 n=new Class5();
		n.display();
		Class4 b=new Class4();
		b.a();
	}
}
