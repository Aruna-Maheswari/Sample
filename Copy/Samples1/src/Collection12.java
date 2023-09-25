import java.util.List;
import java.util.*;
public class Collection12 {
	public static void main(String args[])
	{
		List<Comparable> al=new ArrayList<Comparable>();
		al.add("mahe");
		al.add("Aruna");
		al.add("navya");
		al.add("jagadeesh");
		al.add("jyothi");
		al.add(1);
		al.add(7);
		System.out.println(al);
		List<Comparable> n=new ArrayList<Comparable>();
		n.add("mah");
		n.add("Arun");
		n.add("navy");
		n.add("jaga");
	    n.add("jyothi");
		n.add(1);
		n.add(7);
		System.out.println(n);
		n.retainAll(al);
		System.out.println(n);
		
		
		
		
		
	}

}
