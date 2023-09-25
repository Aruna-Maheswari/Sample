package Inheritenceprograms;

public class methodoverloading1 {
	int add(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		return 0;
	}
	float add(int b,float c)
	{
		
		
		return b+c;
	}
	public static void main(String args[])
	{
		methodoverloading1 mo=new methodoverloading1();
		mo.add(3, 4);
		mo.add(3, 3.1f);
		System.out.println(mo.add(3, 3.14f));
	}

}
