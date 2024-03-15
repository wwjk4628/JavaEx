package com.javaex.basic.loop;

import java.util.Scanner;

public class doWhileEx {
	// 정해지지 않는 수의 정수를 입력, 합산
	// 0이 입력되면 종료
	public static void main(String[] args) {
		// 합산 변수
		int total = 0, num;
		
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요. 0이면 종료:");
		// 스캐너로부터 정수 입력
		do {		
		num = scanner.nextInt();
		total += num;
		System.out.println("합계: " + total);
		}
		// 0이면 합산종료
		while(num !=0);
		// 0이 아니면 입력 게속 받기
		System.out.println("종료");
		scanner.close();
		//스캐너 닫기
		
		
		

	}

}
