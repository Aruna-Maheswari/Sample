import java.util.*;

class Questionpaper1 {
	String a,b,c,d;
	Questionpaper1(String a,String b,String c,String d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
}
class Questionpaper
{
	public static void main(String args[]) {
		Map<Integer,String> am=new LinkedHashMap<Integer,String>();
		am.put(1, "1:what is ur name?");
		am.put(2, "2:how old are u");
		am.put(3, "3:what is ur branch?");
		am.put(4, "4:what is ur collegename?");
		
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		
		m.put(1,"a)aruna b)mahec )dad d)hha");
		m.put(2,"a)4 b)34c)33 d)39");
		m.put(3,"a) b) C) d) ");
		m.put(4,"a) b) c) d)");
		for(int a=1;a<=4;a++)
		{
			System.out.println(am.get(a));
			for(int j=1;j<=a;j++)
			if(j==a)
			{
				System.out.println(m.get(a));
			}
		}
}
}
