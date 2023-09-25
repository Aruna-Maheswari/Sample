package Inheritenceprograms;

public class arunann {
	private String s;
	public void setName(String s)
	{
		this.s=s;
	}

}
class mouni
{
	public static void main(String args[])
	{
		arunann a=new arunann();
		a.setName("mahe");
		System.out.println(a.getName());
	}
}
