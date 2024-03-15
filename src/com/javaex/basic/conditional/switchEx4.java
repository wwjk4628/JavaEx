package com.javaex.basic.conditional;

import java.util.Scanner;

public class switchEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		int i = score / 10;

		switch (i) {
		case 9,10:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("F등급");
			break;
		}

		scanner.close();
	}

}
