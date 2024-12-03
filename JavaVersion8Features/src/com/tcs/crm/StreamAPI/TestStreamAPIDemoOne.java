package com.tcs.crm.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TestStreamAPIDemoOne {
	public static void main(String[] args) {
		String[] strArray = {"Rohan" , "Mohan", "Rahul","Ravi",};
		List<String> strList = Arrays.asList(strArray);
		strList.stream().parallel()
		.filter(s->s.startsWith("R"))
		.forEach(System.out :: println);
	}
}