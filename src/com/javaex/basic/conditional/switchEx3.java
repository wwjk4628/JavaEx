package com.javaex.basic.conditional;

import java.util.Scanner;

public class switchEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		int i = num % 3;
		switch(i) {
		case 0 :
			System.out.println("3의 배수 입니다.");
			break;
		default :
			System.out.println(num + "은 3의 배수가 아닙니다.");
			break;
		}	
		scanner.close();

	}

}
