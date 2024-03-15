package com.javaex.basic.conditional;

import java.util.Scanner;

//tip 컨트롤 플러스 스페이스 자동 임포트
// Ctrl + shift + o 한번에 다 임포트
public class IfElseEx {
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		// 정수 입력 받기
		int score;
		System.out.print("점수 입력:");
		score = scanner.nextInt();
		// 점수 비교
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		// 스캐너닫기
		
		scanner.close();
	}
}
