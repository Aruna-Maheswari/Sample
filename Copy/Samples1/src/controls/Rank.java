package controls;

public class Rank {
	public static void main(String args[])
	{
		int eng=38,mat=90,sci=93;
		//int avg=eng+mat+sci/3;
		int avg=(eng+mat+sci)/3;
		if(eng>=35 && mat>=35 && sci>=35)
		{
			
			if(avg>90 && avg<=100)
			{
				System.out.println("student passed with first rank");
			}
			else if(avg>60 && avg<90)
			{
				System.out.println("student passed with second rank");
			}
			else if(avg>=35 && avg<60)
			{
				System.out.println("student passed with third rank ");
			}
		
			
		}
		else
			System.out.println("Student failed");
		
		
	}
	

}
