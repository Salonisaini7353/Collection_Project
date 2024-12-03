package com.tcs.crm.jstream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// This method is used to get the occurrence of character.
public class StreamAPIUtillity {
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

}





