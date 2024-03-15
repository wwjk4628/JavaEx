package com.javaex.basic.loop;

public class continueEx2 {
	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
int n = 9;
		for (int j = 1; j <= n; j++) {
			
			for (int l = n-1 ; l >= j; l--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * j - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
