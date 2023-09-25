package Inheritenceprograms;
class details4
{
	int r=5;
	String name="Aruna";
	int ir=2;

}
class house  extends details4
{
	void housebill(){
		int units=100;
		int tot=r*units;
		System.out.println(name+ " has to pay the bill about"+tot);
		
		
		
		
	}
}
class industry extends details4
{
	void industrybill()
	{
		int units=200;
		int tot=ir*units;
		System.out.println(name+ " has to pay the bill about"+tot);
		
		
	}
}
public class Powerbill {
	public static void main(String args[])
	{
		house h=new house();
		industry i=new industry();
		h.housebill();
		i.industrybill();
	}
	{
		
	}

}
