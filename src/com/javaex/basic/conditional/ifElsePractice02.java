package com.javaex.basic.conditional;

import java.util.Scanner;

public class ifElsePractice02 {

	public static void main(String[] args) {
		// if로 표현
		Scanner scanner = new Scanner(System.in);
		int code;
		System.out.print("code:");
		code = scanner.nextInt();
		if (code == 1) {
			System.out.println("R101호 입니다.");
		} else if (code == 2) {
			System.out.println("R202호 입니다.");
		} else if (code == 3) {
			System.out.println("R303호 입니다.");
		} else if (code == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		// 스위치로 표현
		
		

		scanner.close();
	}

}
