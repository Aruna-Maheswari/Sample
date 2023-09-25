package Stringconceptprograms;

public class number4 {
	public static void main(String[] args) 
	{
		String str = "arunamaheswari";
		String firstletter = str.substring(0,1);
		System.out.println(firstletter);
		String remainingletters = str.substring(1,str.length());
		System.out.println(remainingletters);
		String s1=str.toUpperCase();
		System.out.println(s1);
		
		firstletter = firstletter.toUpperCase(); 
		str= firstletter + remainingletters;
		System.out.println("Name :" + str);
	}
}


