package com.streamapi;

import java.lang.reflect.Array;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class CreateStreamObject {
	public static void main(String args[])
	{
		//create a stream
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
		//create stream from source
		Collection<String> collection=Array.asList("aruna","mahe","Attt");
//Stream<String> strm=collection.stream();
		strm.forEach(System.out::println);
		List<String> list=Array.asList("aruna","mahe","Attt");
		Stream<String> strm1=list.stream();
		strm.forEach(System.out::println);
	
	}


}
