package Multithreading;

 class Ex6 {
	 synchronized void printTable(int n){ 
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		  }  
		   }  
}  
  
class MyThread1 extends Thread{  
  Ex6 t;  
  MyThread1(Ex6 t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  }  
class MyThread2 extends Thread{  
Ex6 t;  
MyThread2(Ex6 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
public class Ex5{  
public static void main(String args[]){  
Ex6 obj = new Ex6();
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
 

}
