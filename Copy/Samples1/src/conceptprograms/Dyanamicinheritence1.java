package conceptprograms;
class Demo1
{
	static void  display()
	{
		System.out.println("Aruna");
	}void show()
	{
		System.out.println("mahe");
	}
}

public class Dyanamicinheritence1 extends Demo1 {
	static void display()
	{
		System.out.println("v");
	}
	void dis()
	{
		System.out.println("mahe");
	}
	public static void main(String args[])
	{
		 Demo1 d=new  Dyanamicinheritence1();
	     display();
		//d.dis();
	}
	
	

}
