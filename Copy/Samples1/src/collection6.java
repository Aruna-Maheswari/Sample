import java.util.*;
public class collection6 {
	public static void main(String args[])
	{
		TreeSet s=new TreeSet();
		s.add(8);
		s.add(1);
		s.add(7);
		s.add(6);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
