package com.tcs.crm.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TestStreamAPIDemoThree3 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a1", "a1" ,"a2","a3","b1","c1","c2");
		strings.stream()
		.sorted()
		.distinct()
		.filter(s-> {
			
		System.out.println("Name of the Theard := " + Thread.currentThread().getName());
		
		return true;
		
	})
		.forEach(System.out ::println);
	}
	}