package com.hexacta.testelogico.solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution4 {
	public static void main(String[] args) {

		List<String> listOne = Arrays.asList("One", "Two", "Three", "John", "James", "Jack");
		List<String> listTwo = Arrays.asList("Jack", "Three", "One", "Alan", "two", "George");
		printIntersection(listOne, listTwo);
	}

	public static void printIntersection(List<String> list1, List<String> list2) {
		if (list1 != null && list2 != null)
			System.out.println("List common: " + list1.stream().filter(list2::contains).collect(Collectors.toList()));
	}

}
