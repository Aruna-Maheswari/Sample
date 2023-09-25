package Multithreading;

public class Ex2 extends Thread
	{
    public void run()
    {
            System.out.println("r1 ");
            try {
                    Thread.sleep(5000);
            }
            catch(InterruptedException ie)
            { }
            System.out.println("r2 ");
    }
            public static void main(String[] args)
            {
                    Ex2 t1=new Ex2();
                    Ex2 t2=new Ex2();
                    t1.start(); 
                    t2.start();
            }
    



}

