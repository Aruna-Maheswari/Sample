import java.util.*;
public class collection2 {
	public static void main(String args[])
	{
		List s=new LinkedList();
		s.add(1);
		s.add("Aru");
		s.add("mahe");
		s.add("lahari");
		s.add(8);
		s.add(9);
		s.add(2,"arunnn");
		System.out.println(s);
		List l=new ArrayList();
		l.add(2);
		l.add("Ar");
		l.add("mah");
		l.add("lahri");
		System.out.println(l);
		
		
		ListIterator itr=l.listIterator();
		//System.out.println("forward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
