package conceptprograms;

public class constructoroverload {
	constructoroverload()
	{
		System.out.println("Aruna");
	}
	constructoroverload(int a,int b)
	{
		System.out.println(a+b);
	}
	constructoroverload(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		constructoroverload a=new constructoroverload();
		constructoroverload b=new constructoroverload(2.6,3);
		constructoroverload c=new constructoroverload(3,5);
		
	}

}
