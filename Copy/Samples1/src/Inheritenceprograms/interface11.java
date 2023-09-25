package Inheritenceprograms;
interface Arunam
{
	void display();
	
		
	
}
interface Mahe
{
	int a=2;
	void add();
	
}

public class interface11 implements Arunam,Mahe
{
	public void display()
	{
		System.out.println("Aruna");
	}
	public void add()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		interface11 n=new interface11();
		n.add();
		n.display();
		
	}
	

}
