package Inheritenceprograms;
class Aruna
{
	int Aruna(int a)
	{
		System.out.println(a);
		return a;
		
	}
}
public class covariantdata extends Aruna{
	double Aruna(double a)
{
		System.out.println(a);
		return 0.0;
	
	}
public static void main(String args[])
	{
		covariantdata a=new covariantdata();
		a.Aruna(6.7);
	}

}
