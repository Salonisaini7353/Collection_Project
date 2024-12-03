package com.tcs.crm.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TestStreamAPIDemoOne2 {
	public static void main(String[] args) {
		String[] strArray = {"Rohan" , "Mohan", "Rahul","Ravi",};
		List<String> strList = Arrays.asList(strArray);
		strList.parallelStream()
		.filter(s->s.startsWith("R"))
		.forEach(System.out :: println);
	}
}