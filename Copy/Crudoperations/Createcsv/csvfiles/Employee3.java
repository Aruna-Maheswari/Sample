package csvfiles;

import java.io.File;
import java.io.PrintWriter;

public class Employee3 {
	public static void main(String args[])
	{
		 try
			{
				PrintWriter pw=new PrintWriter(new File("D:\\training programs\\Createcsv\\csvfiles\\Employee3.csv"));
				StringBuilder sb=new StringBuilder();
				sb.append("LastName");
				sb.append(",");
				sb.append("FirstName");
				sb.append(",");
				sb.append("Age");
				sb.append(",");
				sb.append("DateOfBirth");
				sb.append(",");
				sb.append("E-MailAddress");
				sb.append("\r\n");
				sb.append("pidugu");
				sb.append(",");
				sb.append("Aruna");
				sb.append(",");
				sb.append("21");
				sb.append(",");
				sb.append("06-12-2001");
				sb.append(",");
				sb.append("ammpidugu@gmail.com");

				
				System.out.println("csv file is created");
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


