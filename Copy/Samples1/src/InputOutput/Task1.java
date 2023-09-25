package InputOutput;
import java.io.*;
public class Task1 {
	public static void main(String args[])throws IOException
	{
		FileOutputStream fo=new FileOutputStream("C:\\Users\\pidugu\\OneDrive\\Desktop\\Aruna.txt");
		String str="She is also a dancer";
		String str1="She is also a dancer";
		
		byte b[]=str.getBytes();
		byte b1[]=str1.getBytes();
		fo.write(b);
		fo.write(b1);

		System.out.println("success");
		
	}
}