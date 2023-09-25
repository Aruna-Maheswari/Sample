package exampleprograms;

public class LamdaExample {
	
	
	    public static void main(String[] args)
	    {

	        HelloWorld mylambda1= (s) -> {System.out.println("Hello 1 ");};
	        
	        HelloWorld mylambda2=  s -> {System.out.println("Hello 2 ");};
	        
	        mylambda1.greet("World");
	        mylambda2.greet("JIP");
	        
	    }
	}
	interface HelloWorld
	{
	    public void greet(String welcome);
	}


