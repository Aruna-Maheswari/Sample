package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class javaStream {
	

	public static void main(String args[])
	{
		List<Employee> list=new ArrayList();
		list.add(new Employee(101,"Aruna",101,"Active",2000));
		list.add(new Employee(102,"mahe",102,"inactive",3000));
		list.add(new Employee(103,"Arun",102,"Active",3000));
		list.add(new Employee(104,"Aru",101,"Active",6000));
		list.add(new Employee(105,"karuna",103,"inactive",4000));
		list.add(new Employee(106,"pidugu",103,"inactive",2000));
		
		// toprint employe details based on deptid
		
		Map<Integer, List<Employee>> employeedeptid=list.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
		employeedeptid.entrySet().forEach(entry->{
			System.out.println(entry.getKey()  + "  "  +entry.getValue());
		});
		
		
	}
}

