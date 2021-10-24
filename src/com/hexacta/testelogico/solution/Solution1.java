package com.hexacta.testelogico.solution;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

	public static void main(String args[]) {

		int[] intArray[] = new int[][] { { 1, 3, 6, 4, 1, 2 }, { 1, 2, 3 }, { -1, -3 } };

		System.out.println("Teste de Lógica Hexacta:");
		System.out.println("dado A = [1, 3, 6, 4, 1, 2], a função deve retornar 5: " + solution(intArray[0]));
		System.out.println("dado A = [1, 2, 3], a função deve retornar 4: " + solution(intArray[1]));
		System.out.println("dado A = [-1, -3], a função deve retornar 1: " + solution(intArray[2]));
	}
    
	public static int solution(int[] array) {
		int number = array.length;

		Set<Integer> set = new HashSet<>();

		for (int a : array) {
			if (a > 0)set.add(a);
		}

		if (set.size() == 0)return number = 1;

		for (int i = 1; i <= number + 1; i++) {
			if (!set.contains(i)) {
				number = i;
				break;
			}		
		}
		return number;
	}
}
