package demos;

public class Multiply 
{
	void multi(float a,float b)
	{
		float c=a*b;
		System.out.println("Multiplication of two float values is"+c);
	}
	public static void main(String args[])
	{
		Multiply m=new Multiply();
		m.multi(2.1f,3.0f);
	}

}
