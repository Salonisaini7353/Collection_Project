package com.tcs.crm.J_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPI_ReverseOrder {
	public static void main(String[] args) {

		Integer[] intArray = {45,66,98,54,44,23,45};
		List<Integer> ArrayList = Arrays.asList(intArray);

		ArrayList.stream()
		.filter(i->i <98)
		.sorted(Comparator.reverseOrder())
		.distinct()
		.forEach(System.out :: println);

	}

}
