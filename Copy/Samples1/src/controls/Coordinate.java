package controls;

public class Coordinate {
	public static void main(String args[]) {
		int x=1,y=0;
		if(x==0 && y==0)
		{
			System.out.println(+x+ "and" +y+ "lies on origin");
		}
		else if(x==0 && y!=0)
		{
			System.out.println(+x+ "and" +y+ "lies y-axis");
		}
		else if(x!=0 && y==0)
		{
			System.out.println(+x+ " and" +y+ " lies x-axis");
		
		}
	}

}
