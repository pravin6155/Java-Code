package com.abc;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedString {

	public static void main(String[] args) {

		String input="aabb";
		
		char result=input.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
				System.out.println("Most repeated Character :"+result);
				
					List<Character> result1=input.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
							.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue))
							.entrySet().stream().max(Map.Entry.comparingByKey())
							.get().getValue().stream().map(Map.Entry::getKey)
							.collect(Collectors.toList());
					System.out.println("Most repeated Char : "+ result1);
	
	}

}
