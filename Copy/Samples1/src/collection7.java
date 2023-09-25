import java.util.*;
public class collection7 {
public static void main(String args[])
{
	TreeSet<String> set=new TreeSet<String>();  
  set.add("Dcd");  
 set.add("Bad");  
set.add("Cba");  
set.add("Dda");  
set.add("Eab");  
System.out.println("Initial Set: "+set);  
  
System.out.println("Reverse Set: "+set.descendingSet());  
  
System.out.println("Head Set: "+set.headSet("Eba"));  
 
System.out.println("SubSet: "+set.subSet("A", "E"));  
  
System.out.println("TailSet: "+set.tailSet("C", false));  
}  
}  



	

