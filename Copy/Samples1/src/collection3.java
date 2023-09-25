import java.util.*;
class collection3 {
	int rollno;
	String nm,address;
	collection3(int rollno,String nm,String address)
	{
		this.rollno=rollno;
		this.nm=nm;
		this.address=address;
		
	}

	public static void main(String args[])
	{
		List<collection3> list=new LinkedList();
		collection3 c1=new collection3(1,"aru","hyd");
		collection3 c2=new collection3(2,"mahe","vzm");
		collection3 c3=new collection3(3,"bhanu","vsp");
		collection3 c5=new collection3(3,"bhan","vijayawada");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c5);
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			collection3 c=(collection3)itr.next();
			System.out.println(c.rollno+"  "+c.nm+"  "+c.address);
		}
		//for(integer c:list)
		//{
			//System.out.println(c.rollno+"   "+c.nm+"  "+c.address);
		//}
		
		
		
		
	}
}

