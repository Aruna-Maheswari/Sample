package Stringconceptprograms;

public class Wordcount {
	public static void main(String args[])
	{
		String sentence="Aruna is a good girl";
		int count=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' ')
			{
				count++;
			}
		}
		count++;
		System.out.println("no of words in a given sentenc is:"+count);
	}

}
