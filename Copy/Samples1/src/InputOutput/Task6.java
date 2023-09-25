package InputOutput;
import java.io.*;

public class Task6 {
	public static void main(String args[])
	{
		 try {  
	            Writer w = new FileWriter("C://output.txt");  
	            String str = "I love my country";  
	            w.write(str);  
	            w.close();  
	            System.out.println("Done");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}  
	
	


