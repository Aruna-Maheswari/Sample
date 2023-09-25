package conceptprograms;

public class copycons {
	int x,y;
	copycons(int x,int y)
	{
	   this.x=x;
	   this.y=y;
	}
	copycons(copycons ct)
	{
		int x=ct.x;
		int y=ct.y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		//System.out.println(z);
		//System.out.println(p);
	}
	public static void main(String args[])
	{
		copycons s=new copycons(4,2);
		copycons n=new copycons(s);
		System.out.println(s.x);
		System.out.println(s.y);
		
		s.display();
		
	}
	

}
