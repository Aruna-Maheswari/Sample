package Multithreading;
class sleep1 extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
		public static void main(String args[])
		{
			sleep1 s=new sleep1();
			s.start();
					for(int j=6;j<=1;j++)
					{
						System.out.println(j);
		}
	}
	

}
