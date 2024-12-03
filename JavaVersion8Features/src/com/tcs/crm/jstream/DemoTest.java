package com.tcs.crm.jstream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoTest {
	public static void main(String[] args) {

		String[] strArray = {"Kajal","Saloni","Kajal","Deepak","Deepak"};
		List<String> strList = Arrays.asList(strArray);
		Map<String, Long> collectMap = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(k->k.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry :: getKey,  Map.Entry :: getValue));

		System.out.println(collectMap);
	}

}





















