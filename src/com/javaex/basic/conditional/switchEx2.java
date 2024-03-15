package com.javaex.basic.conditional;

import java.util.Scanner;

public class switchEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = null; // 변수 초기화
		System.out.println("월을 입력하세요");
		int date = scanner.nextInt();

		switch (date) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31일 입니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println("30일 입니다.");
			break;
		case 2:
			System.out.println("28일 입니다.");
			break;
		default:
			System.out.println("?");
			message = "?";
			break;
		}
		System.out.println(message);
		scanner.close();
	}
	 

}
