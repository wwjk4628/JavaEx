package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
//		int[][] twoDimen = new int[5][10];
		
		int[][] table = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{ 2, 3, 4, 5, 6, 7, 8, 9, 10, 1},
				{ 3, 4, 5, 6, 7, 8, 9, 10, 1, 2},
				{ 4, 5, 6, 7, 8, 9, 10, 1, 2, 3},
				{ 5, 6, 7, 8, 9, 10, 1, 2, 3, 4}
				
		};	// 5행 10열 배열
		System.out.println(table);
		System.out.println(table.length);
		System.out.println(table[0].length);
		int sum = 0;
		for (int i = 0; i < table.length; i++) {
			for(int n = 0; n < table[i].length; n++) {
				sum += table[i][n];
				System.out.print(table[i][n] + "\t");
			}
			System.out.println("");
			
		}
		System.out.println("총합: " + sum);
		
		
		
		

	}

}
