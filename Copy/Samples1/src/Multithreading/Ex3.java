package Multithreading;

class Ex4 extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			 
				Thread.sleep(1000);
			
		}
	}

}
class Ex3 extends Thread
{
	public void run()
	{
		for(int i=3;i<=10;i++)
		{
			System.out.println(i);
			//try
			//{
			//Thread.sleep(1000);
		//}
			//catch(Exception ed)
			//{
				//System.out.println(ed);
			//}
	}
	}

	public static void main(String args[])
	{
	    Ex3 e=new Ex3();
	    //Ex5 ex=new Ex5();
	    e.start();
	    
	    ex.start();
	    
	 
	   }
	}

