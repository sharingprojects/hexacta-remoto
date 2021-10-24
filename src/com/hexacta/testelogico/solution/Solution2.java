package com.hexacta.testelogico.solution;

import java.util.HashSet;

class Solution2 {
	
	public static void main(String[] args) {
	  init();
	}
	
	private static void init() {
		Solution2 e = new Solution2();
		int[] input = new int[] { -2, -1, 0, 2, 4, 7, 8, 9, 9 };
		int sum = 8;
		HashSet<Pair> result = e.findAllPairs(input, sum);
		System.out.println("Dado um array = [-2, -1, 0, 2, 4, 7, 8, 9, 9] e x = 8 como entrada," 
                + " a resposta do seu algoritmo deverá ser [[-1, 9], [0, 8], [4, 4]] (não precisando ser necessariamente nesta ordem):");
		for (Pair p : result) {
			System.out.println("(" + p.getElement1() + "," + p.getElement2() + ")");
		}		
	}

	public HashSet<Pair> findAllPairs(int[] inputList, int sum) {
	    HashSet<Integer> allElements = new HashSet<Integer>();
	    HashSet<Integer> substracted = new HashSet<Integer>();
	    HashSet<Pair> result = new HashSet<Pair>();

	    for (int i : inputList) {
	      allElements.add(i);
	      substracted.add(i - sum);
	    }
	    for (int i : substracted) {
	      if (allElements.contains(-1 * i)) {
	        addToSet(result, new Pair(-i, i + sum));
	      }
	    }
	    return result;
	  }

	  public void addToSet(HashSet<Pair> original, Pair toAdd) {
	    if (!original.contains(toAdd) && !original.contains(reversePair(toAdd))) {
	      original.add(toAdd);
	    }
	  }

	  public Pair reversePair(Pair original) {
	    return new Pair(original.getElement2(), original.getElement1());
	  }

	
	class Pair {
		private int element1;
		private int element2;

		public Pair(int e1, int e2) {
			element1 = e1;
			element2 = e2;
		}

		public int getElement1() {
			return element1;
		}

		public int getElement2() {
			return element2;
		}

		public int hashCode() {
			return (element1 + element2) * element2 + element1;
		}

		public boolean equals(Object other) {
			if (other instanceof Pair) {
				Pair otherPair = (Pair) other;
				return ((this.element1 == otherPair.element1) && (this.element2 == otherPair.element2));
			}
			return false;
		}
	}
	
}