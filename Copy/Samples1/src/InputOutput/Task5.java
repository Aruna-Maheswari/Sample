package InputOutput;
import java.util.*;
import java.io.*;

public class Task5 {
	public static void main(String args[])
	
	{
		try
	   {
		FileOutputStream fo=new FileOutputStream("D:\\Mahe.txt");
		String str=" She is also a dancer";
	
		
		byte b[]=str.getBytes();
		
		fo.write(b);
		

		System.out.println("success");
	  }
	catch(Exception e) {
		
	}

}
}
