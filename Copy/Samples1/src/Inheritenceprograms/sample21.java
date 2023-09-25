package Inheritenceprograms;

abstract class sample21 {
	abstract int add();
	int add(int a)
	{
		System.out.println(a);
		return a;
		
	}
	
	

}
class M extends sample21
{
	//int add() {
		//return 3+2;
	//}
	public static void main(String args[])
	{
		M m=new M();
		m.add();
		m.add(8);
		
		
	}
}