package com.javaex.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// [Ex06.java]
//나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
//작성하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 :");
		int age1 = scanner.nextInt();
		if (age1 < 65 && age1 >= 19 ) {
			System.out.println("1번그룹입니다.");
		}else{
			System.out.println("2번그룹입니다.");
		}
		
//		[Ex07.java]
//나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 :");
		int age = scanner.nextInt();
		if (age <= 7) {
			System.out.println("취학전아동/무료입니다.");
		}else if (age <= 13) {
			System.out.println("초등학생/2000원 입니다.");
		}else if (age <= 16) {
			System.out.println("중학생/3000원 입니다.");
		}else if (age <= 19) {
			System.out.println("고등학생/4000원 입니다.");
		}else {
			System.out.println("성인/5000원 입니다.");
		}
//		[Ex08.java]
//사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
//프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)

	}

}
