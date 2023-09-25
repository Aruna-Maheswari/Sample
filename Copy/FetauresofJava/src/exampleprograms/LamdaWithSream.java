package exampleprograms;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class LamdaWithSream {
	public static void main(String args[])
	{
		
		List<String> list=Arrays.asList("Aruna","","mah","hema");
		list.stream().filter(x->x=="Aruna").forEach(System.out::println);
	     list.stream().filter(x-> x.length() == 3).forEach(System.out::println);
	     list.stream().limit(3).sorted().forEach(System.out::println);
	     list.parallelStream().forEach(System.out::println);
	     list.parallelStream().filter(x->x.isEmpty()).forEach(System.out::println);
	     List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	     List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

	     System.out.println("Filtered List: " + filtered);
	     String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
	     System.out.println("Merged String: " + mergedString);
	     List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

	   //get list of unique squares
	   List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
	   System.out.println("squareList:" +squaresList);
	   
	   List<Integer> squaresList1 = numbers.stream().map( i -> i%2).distinct().collect(Collectors.toList());
	   System.out.println("squareList:" +squaresList1);
	  

	   IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

	   System.out.println("Highest number in List : " + stats.getMax());
	   System.out.println("Lowest number in List : " + stats.getMin());
	   System.out.println("Sum of all numbers : " + stats.getSum());
	   System.out.println("Average of all numbers : " + stats.getAverage());
	   
	   
	   
	   

	     
	    
		
		
	}

}
