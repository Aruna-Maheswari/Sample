package Inheritenceprograms;

 class Ab {
	void display() {
		System.out.println("Aruna");
		
	}

}
 class methodoveriding1 extends Ab
{
	void display() {
		System.out.println("mahe");
	}
	public static void main(String args[])
	{
		methodoveriding1 a=new methodoveriding1();
		a.display();
	}
}
