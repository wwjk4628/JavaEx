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

		double m;
		double kg;
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키:");
		m = scanner.nextInt();
		System.out.print("몸무게:");
		kg = scanner.nextInt();
		double BMI = kg / (m*m);
		if (BMI <= 18.5) {
			System.out.println("저체중입니다.");
			System.out.println(BMI);
		} else if (BMI <= 24.9) {
			System.out.println("정상체중입니다.");
			System.out.println(BMI);
		} else {
			System.out.println("과체중입니다.");
			System.out.println(BMI);
		}
//		[Ex09.java]
//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
//니다.
//⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도:");
		int year = scanner.nextInt();
		int age2 = 2023 - year;
		if (age2 <15 && age2 >= 65) {
			System.out.println(age2 + "살 무료예방 접종 대상자 입니다.");
		} else {
			System.out.println(age2 + "살 무료예방 접종 대상자가  아닙니다.");
		}
		
//		[Ex10.java]
//두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
		System.out.print("숫자1:");
		int num = scanner.nextInt();
		System.out.print("숫자2:");
		int num2 = scanner.nextInt();
		if (num > num2) {
			System.out.println("큰수: " + num + "    작은수: " + num2 + "입니다.");
		} else {
			System.out.println("큰수: " + num2 + "    작은수: " + num + "입니다.");
		}
//		[Ex11.java]
//두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
		//ssss
	}

}
