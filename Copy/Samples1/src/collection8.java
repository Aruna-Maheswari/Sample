import java.util.*;
 class collection9 {
	int id;  
	String name,author,publisher;  
	int quantity;  
	collection9(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	}  
	public class collection8 {  
		public static void main(String args[])
		{
			LinkedHashSet hs=new LinkedHashSet();  
		    
			collection9  b1=new collection9 (108,"Let us C","Yashwant Kanetkar","BPB",8);  
			collection9  b2=new collection9 (102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
			collection9  b3=new collection9 (103,"Operating System","Galvin","Wiley",6);  
		     
		    hs.add(b1);  
		    hs.add(b2);  
		    hs.add(b3); 
		    Iterator itr=hs.iterator();
		    while(itr.hasNext())
		    {
		    	collection9 c9=(collection9)itr.next();
		    	System.out.println(c9.id+" "+c9.author+" "+c9.publisher+" "+c9.quantity);
		    }
		    
		     
		     
		}
	

}
