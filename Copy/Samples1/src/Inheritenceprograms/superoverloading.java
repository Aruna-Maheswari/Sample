package Inheritenceprograms;
class display
{   int a=1;
	 display() {
		System.out.println("Aruna");
	}
}

class display1 extends display
{
	display1()
	{
		super();
		System.out.println("mahe");
		//super.display();
		System.out.println(super.a);
		//super();
		
	}
}

public class superoverloading {
	public static void main(String args[])
	{
		
	   display1 m=new display1();
	  // m.display();
	   //super.display();
	  // System.out.println(super.a);
	  // super();

}
}
