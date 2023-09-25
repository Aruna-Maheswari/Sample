package Inheritenceprograms;

abstract class abstract1 {
	abstract int add();
	void display()
	{
		System.out.println("sai");
	}

}
class abstract11 extends abstract1
{
	int add()
	{
		System.out.println("mm");
		return 0;
	}
	public void display()
	{
		System.out.println("Aruna");
	}
	public static void main(String args[])
	{
		abstract1 abc=new abstract11();
		abc.display();
		
		abc.add();
	}
}
