package com.javaex.basic.conditional;

import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		//
		Scanner scanner = new Scanner(System.in);		
		System.out.println("과목 번호를 입력하세요.");
		int code;
		System.out.print("code:");
		code = scanner.nextInt();
		
		switch(code) {
		case 1 :
			System.out.println("R101호 입니다.");
			break;
		case 2 :
			System.out.println("R202호 입니다.");
			break;
		case 3 :
			System.out.println("R303호 입니다.");
			break;
		case 4 :
			System.out.println("R404호 입니다.");
			break;
		default :
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		

		scanner.close();
	}

}
