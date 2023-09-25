package exampleprograms;

 interface Sample3 {
	
	void display(String s,String s1);
	

}
class Sample2
{
	public static void main(String args[])
	{
         Sample3 ss=(s,s1)->System.out.println("First string is:"+s+ "    Second String is:"+s1);
		ss.display("Arina", "mahe");
	}
}