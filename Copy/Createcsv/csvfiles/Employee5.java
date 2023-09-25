package csvfiles;

import java.io.File;
import java.io.PrintWriter;

public class Employee5 {
	public static void main(String args[])
	{
		 try
			{
				PrintWriter pw=new PrintWriter(new File("D:\\training programs\\Createcsv\\csvfiles\\Employee5.csv"));
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
				sb.append(",");
				sb.append("Address");
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
				sb.append("\r\n");
				sb.append("pulapa");
				sb.append(",");
				sb.append("mahe");
				sb.append(",");
				sb.append("22");
				sb.append(",");
				sb.append("06-12-2000");
				sb.append(",");
				sb.append("ampidugu@gmail.com");
				sb.append("\r\n");
				sb.append("pidugu");
				sb.append(",");
				sb.append("karuna");
				sb.append(",");
				sb.append("22");
				sb.append(",");
				sb.append("06-12-2000");
				sb.append(",");
				sb.append("ampidu@gmail.com");
				sb.append("\r\n");
				sb.append("pulapa");
				sb.append(",");
				sb.append("mahe");
				sb.append(",");
				sb.append("22");
				sb.append(",");
				sb.append("06-12-2000");
				sb.append(",");
				sb.append("ampidugu@gmail.com");
				sb.append("\r\n");
				sb.append("pulapa");
				sb.append(",");
				sb.append("mahe");
				sb.append(",");
				sb.append("22");
				sb.append(",");
				sb.append("06-12-2000");
				sb.append(",");
				sb.append("ampidugu@gmail.com");
				sb.append("\r\n");
				
				
				
				pw.write(sb.toString());
				
				System.out.println("csv file is created");
				pw.close();
	}
		 catch(Exception e)
		 {
			 
		 }

}
}

