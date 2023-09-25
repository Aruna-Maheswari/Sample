package InputOutput;
import java.io.*;
import java.util.*;
public class Task4 {
	public static void main(String args[])
	
	{
		try {
	
		
	
		FileOutputStream f1=new FileOutputStream("C:\\Users\\pidugu\\OneDrive\\Desktop\\Mahe2.txt",true);
		BufferedOutputStream b2=new BufferedOutputStream(f1);
		String str="Aruna";
		//String str2="She is";
		
		byte b[]=str.getBytes();
		//byte b1[]=str2.getBytes();
		b2.write(b);
		//b2.write(b1);

		System.out.println("success");
		f1.flush();
		b2.close();
		f1.close();
		
		

	}
		catch(Exception e)
		{
			
		}

}
}
