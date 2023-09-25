package InputOutput;
import java.io.*;
import java.util.*;
public class Task2 {
	public static void main(String args[]) {
		try
		{
        int count=0;
		FileInputStream file = new FileInputStream("C:\\Users\\pidugu\\OneDrive\\Desktop\\Aruna.txt");
        
	     
	      Scanner sc = new Scanner(file);

	     
	      while(sc.hasNextLine()) {
	        sc.nextLine();
	        count++;
	      }
	      System.out.println("Total Number of Lines: " + count);

	     
	      sc.close();
	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	}
		

}
