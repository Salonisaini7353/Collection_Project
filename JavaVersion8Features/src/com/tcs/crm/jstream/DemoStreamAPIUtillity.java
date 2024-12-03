package com.tcs.crm.jstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamAPIUtillity {
	public void findCharOccurrence() {
		String strobj = "SaloniSaini";
		Map<String, Long> collectmapobj = Stream.of(strobj.split(""))
				.map(String :: toUpperCase)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collectmapobj);
	}
	public void findWordOccurrence() {
		String strobj = "I am a java developer and php developer";
		Map<String, Long> collectmapobj = Stream.of(strobj.split(" "))
				.map(String :: toUpperCase)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collectmapobj);
	}

	public void findDuplicateWithCount() {
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
