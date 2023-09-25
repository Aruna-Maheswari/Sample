package Multithreading;

public class Ex1 extends Thread{
	public synchronized void run()
	{
	
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Ex1 e=new Ex1();
		
		
		e.start();
		
		for(int i=6;i<=10;i++)
		{
			System.out.println(i);
		}
	
	}
}
	