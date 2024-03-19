package com.javaex.basic.loop;

public class continueEx2 {
	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
		ex4();
//		ex5();
	}

	public static void ex1() {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}

	public static void ex2() {
		int i = 2;
		int n = 1;
		while (i < 10) {
			n = 1;
			System.out.println(i + "단");
			while (n < 10) {
				System.out.println(i + " * " + n + " = " + i * n);
				n += 1;
			}

			i += 1;

		}
	}

	public static void ex3() {
		int j = 6;
		for (int i = 1; i <= j; i++) {
			for (int n = 0; n < i; n++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void ex4() {
		int i = 1;
		int n = 1;
		while (i <= 6) {
			n = 1;
			while (n <= i) {
				n += 1;
				System.out.print("*");

			}
			i += 1;
			System.out.println("");

		}

	}

	public static void ex5() {
		int m = 7;
		for (int j = 1; j <= m; j++) {

			for (int l = m - 1; l >= j; l--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * j - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}