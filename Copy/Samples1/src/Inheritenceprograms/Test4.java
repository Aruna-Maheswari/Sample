package Inheritenceprograms;
class Details
{
	int no=545;
	String name="Aruna";
}
class Studentdetials extends Details
{
	String branch="CSE";
    String clgname="miracle";
}
class Showdetails extends Studentdetials
{
	void display()
	{
		System.out.println(name);
		System.out.println(no);
		System.out.println(branch);
	}
	
}
public class Test4 {
public static void main(String args[])
{
	Showdetails s=new Showdetails();
	s.display();
	
}
}
