package exampleprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sampleExample {
	public static void main(String args[])
	{
		List<String> list=Arrays.asList("Aruna","mah","hema");
		list.parallelStream().forEach(System.out::println);
		list.stream().limit(3).sorted().filter(x->x!="Aruna").forEach(System.out::println);
		 List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		   //get list of unique squares
		   List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		   System.out.println("squareList:" +squaresList);

}
}
