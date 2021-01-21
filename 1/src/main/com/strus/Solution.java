package com.strus;

import java.util.*;

public class Solution {
	/*
	 * Дано n - число уровней. Построить треугольник из символов #. Пример для n =
	 * 4: 
	 *    # 
	 *   ## 
	 *  ### 
	 * #### 
	 * ----------------------------------------
	 */

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println(Thread.currentThread().getName());

		StairsBuilder stairs = new StairsBuilder();

		stairs.setStairs(n);

		new Thread(stairs::output).start();
		
		scanner.close();
	}

}