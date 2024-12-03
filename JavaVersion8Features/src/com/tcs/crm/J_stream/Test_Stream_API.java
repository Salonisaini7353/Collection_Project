package com.tcs.crm.J_stream;

import java.util.Arrays;
import java.util.List;

public class Test_Stream_API {
	public static void main(String[] args) {
		Integer[] intArray = {23, 67, 34, 22, 45,98,54};
		List<Integer> intList = Arrays.asList(intArray);
		intList.stream()
		.filter(i->i >45)
		.sorted()
		.forEach(System.out :: println);


	}
}