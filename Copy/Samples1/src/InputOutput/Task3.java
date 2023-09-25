package InputOutput;
import java.io.*;
public class Task3 {
	public static void main(String args[])
	
	{
	try
	{
		FileInputStream fi= new FileInputStream ("C:\\Users\\pidugu\\OneDrive\\Desktop\\Aruna.txt");
		
		System.out.println(fi.read());
		int i;
	while(( i = fi.read())!=-1)
	{
		
		System.out.print((char)i);

	}
	}
	catch(Exception e )
	{
		
	}
}
}
