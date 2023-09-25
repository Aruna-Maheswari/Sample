package Stringconceptprograms;

public class number11 {

	public static void main(String[] args) {
		String str = "Arunamaheswari";
		char search = 'a';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==search)
				count++;
		}
		System.out.println("The character "+search+ " appears " +count+" times.");

	}

}


