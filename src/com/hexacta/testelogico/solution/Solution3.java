package com.hexacta.testelogico.solution;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution3 {
	
	public static void main(String[] args) {
		
		double p = 0.999999999999D;
		
		System.out.println("calcPM(m = 1000, p = 0.999999999999D): " + roundingValue(calcPM(1000, p)));
		System.out.println("calcPM(m = 1000000, p = 0.999999999999D): " + roundingValue(calcPM(1000000, p)));
		System.out.println("calcPM(m = 1000000000, p = 0.999999999999D): " + roundingValue(calcPM(1000000000, p)));
	}
	
	public static double calcPM(int m, double p) {		
		double result = 1;		
		if (1 <= m || m <= p) {
			for (int i = m; i >= 1; i--) {
				result = result * p;
			}
		}		
		return result;		
	}	

	private static BigDecimal roundingValue(double result) {
		BigDecimal bd = new BigDecimal(result).setScale(11, RoundingMode.FLOOR);
		return bd;
	}

}
