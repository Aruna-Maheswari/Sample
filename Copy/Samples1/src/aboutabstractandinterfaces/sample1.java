package aboutabstractandinterfaces;

abstract class B {
	abstract int add();
     int sub()
     {
    	return 7-3; 
     }
	

}
class sample1 extends B
{
	int add()
	{
		return 3+2;
	}
	public static void main(String args[])
	{
		sample1 n=new sample1();
		n.add();
		n.sub();
	}
}
