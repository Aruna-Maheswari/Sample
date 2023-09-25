package Inheritenceprograms;
class One
{
	final void display()
	{
		System.out.println("Aruna");
	}
}
public class methodoverriding3 extends One{
	 final void display() 
		{
			System.out.println("Aruna");
		}
	public static void main(String args[])
	{
		 methodoverriding3 m=new  methodoverriding3 ();
		m.display();
}
}
