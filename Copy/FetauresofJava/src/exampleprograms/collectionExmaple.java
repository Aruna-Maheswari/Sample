package exampleprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class collectionExmaple {
	
	public static void main(String args[])
	{
		Map<Integer,String> m=new LinkedHashMap<>();
		m.put(1,"Aruna");
		m.put(2,"Aru");
		m.put(3,"Arun");
		m.put(4,"Arunamahe");
		
		
		m.forEach((k, v) -> 
		  System.out.println("Key = " + k + ", Value = " + v));
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		int arr[]= {1,2,3,4,5,5};
		for(int m1:arr)
		{
			System.out.println(m1);
		}
       List l=new ArrayList();
       l.add("skjdk");
       l.add("sk");
       l.add("skk");
       l.add("skk");
       

	}
}
