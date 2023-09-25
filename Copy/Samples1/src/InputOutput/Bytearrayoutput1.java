package InputOutput;
import java.io.*;
public class Bytearrayoutput1 {
	public static void main(String args[])throws Exception
	{
		FileOutputStream fi=new FileOutputStream("D://Aru.txt");
		FileOutputStream f=new FileOutputStream("D://Aru1.txt");
		ByteArrayOutputStream b=new ByteArrayOutputStream();
		String s="i am Aruna";
		byte b1[]=s.getBytes();
		b.write(b1);
		b.writeTo(fi);
		b.writeTo(f);
		
		System.out.println("sucess");
		
		

	}

}
