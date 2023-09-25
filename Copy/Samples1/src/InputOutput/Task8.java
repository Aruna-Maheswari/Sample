package InputOutput;
import java.io.*;
public class Task8 {
	public static void main(String args[])
	{
		try {
		File f1=new File("C:\\Users\\pidugu\\OneDrive\\Desktop\\Mahe2.txt"); //Creation of File Descriptor for input file
	      String[] words=null;    //Intialize the word Array
	      int wc=0;     //Intialize word count to zero
	      FileReader fr = new FileReader(f1);    //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
	      String s;
	      while((s=br.readLine())!=null)    //Reading Content from the file
	      {
	         words=s.split(" ");   //Split the word using space
	         wc=wc+words.length;   //increase the word count for each word
	      }
	      fr.close();
	      System.out.println("Number of words in the file:" +wc);
	}
		catch(Exception e)
		{


}
	}}

