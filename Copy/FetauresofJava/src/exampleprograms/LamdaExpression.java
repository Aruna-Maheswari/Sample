package exampleprograms;
interface Sample
{
	void add(int a,int b);
}
public class LamdaExpression {
	public static void main(String[] args)
	{
		Sample s=(a,b)-> System.out.println(a+b);
		
			s.add(1,8);
		}
	}


