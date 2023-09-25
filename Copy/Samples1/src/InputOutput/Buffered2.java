package InputOutput;
import java.util.*;
import java.io.*;

public class Buffered2 {
	public static void main(String args[]) {
		try
		{
			FileInputStream fi= new FileInputStream ("C:\\Users\\pidugu\\OneDrive\\Desktop\\Mahe2.txt");
			BufferedInputStream b3=new BufferedInputStream(fi);
			
			System.out.println(b3.read());
			int i;
		while(( i = b3.read())!=-1)
		{
			
			System.out.print((char)i);

		}
		fi.close();
		b3.close();
		}
		catch(Exception e )
		{
			
		}
		
	}
	

}
