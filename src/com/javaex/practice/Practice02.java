package com.javaex.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

//		ex6();
//		ex7();
//		ex8();
//		ex9();
//		ex10();
//		ex11();
//		ex12();
//		ex13();
//		ex14();
//		ex15();
//		ex16();
//		ex17();
//		ex18();
//		ex19();
//		ex20();
//		ex21();
	}

// [Ex06.java]
//나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
//작성하세요.
	public static void ex6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 :");
		int age1 = scanner.nextInt();
		if (age1 < 65 && age1 >= 19) {
			System.out.println("1번그룹입니다.");
		} else {
			System.out.println("2번그룹입니다.");
		}
		scanner.close();
	}

//		[Ex07.java]
//나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
	public static void ex7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 :");
		int age = scanner.nextInt();
		if (age <= 7) {
			System.out.println("취학전아동/무료입니다.");
		} else if (age <= 13) {
			System.out.println("초등학생/2000원 입니다.");
		} else if (age <= 16) {
			System.out.println("중학생/3000원 입니다.");
		} else if (age <= 19) {
			System.out.println("고등학생/4000원 입니다.");
		} else {
			System.out.println("성인/5000원 입니다.");
		}
		scanner.close();
	}

//		[Ex08.java]
//사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
//프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
	public static void ex8() {
		Scanner scanner = new Scanner(System.in);
		double m;
		double kg;
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키:");
		m = scanner.nextInt();
		System.out.print("몸무게:");
		kg = scanner.nextInt();
		double BMI = kg / (m * m);
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
		scanner.close();
	}

//		[Ex09.java]
//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
//니다.
//⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
	public static void ex9() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도:");
		int year = scanner.nextInt();
		int age2 = 2023 - year;
		if (age2 < 15 && age2 >= 65) {
			System.out.println(age2 + "살 무료예방 접종 대상자 입니다.");
		} else {
			System.out.println(age2 + "살 무료예방 접종 대상자가  아닙니다.");
		}
		scanner.close();
	}

//		[Ex10.java]
//두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
	public static void ex10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1:");
		int num = scanner.nextInt();
		System.out.print("숫자2:");
		int num2 = scanner.nextInt();
		if (num > num2) {
			System.out.println("큰수: " + num + "    작은수: " + num2 + "입니다.");
		} else {
			System.out.println("큰수: " + num2 + "    작은수: " + num + "입니다.");
		}
		scanner.close();
	}

//		[Ex11.java]
//두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
	public static void ex11() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1:");
		int num3 = scanner.nextInt();
		System.out.print("숫자2:");
		int num4 = scanner.nextInt();
		if (num3 > num4) {
			System.out.println("몫: " + num3 / num4 + "    나머지: " + num3 % num4);
		} else {
			System.out.println("몫: " + num4 / num3 + "    나머지: " + num4 % num3);
		}
		scanner.close();
	}

//		[Ex12.java]
//숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
	public static void ex12() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1:");
		int num5 = scanner.nextInt();
		System.out.print("숫자2:");
		int num6 = scanner.nextInt();
		System.out.print("숫자3:");
		int num7 = scanner.nextInt();

		if (num5 < num6 && num5 < num7) {
			System.out.println("가장 작은수는 " + num5 + " 입니다.");
		} else if (num6 < num5 && num6 < num7) {
			System.out.println("가장 작은수는 " + num6 + " 입니다.");
		} else {
			System.out.println("가장 작은수는 " + num7 + " 입니다.");
		}
		scanner.close();
	}

//		[Ex13.java]
//두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
//(0은 입력하지 않습니다.)
	public static void ex13() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1:");
		int num8 = scanner.nextInt();
		System.out.print("숫자2:");
		int num9 = scanner.nextInt();
		if (num8 > num9) {
			if (num8 % num9 == 0) {
				System.out.println(num9 + " 는(은) " + num8 + "읠 약수입니다.");
			} else {
				System.out.println(num9 + " 는(은) " + num8 + "읠 약수가 아닙니다.");
			}
		} else {
			if (num9 % num8 == 0) {
				System.out.println(num8 + " 는(은) " + num9 + "읠 약수입니다.");
			} else {
				System.out.println(num8 + " 는(은) " + num9 + "읠 약수가 아닙니다.");
			}
		}
		scanner.close();
	}

//[Ex14.java]
//사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
//⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
//(사번 0은 고려하지 않습니다.)
	public static void ex14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int sabun = scanner.nextInt();
		int team = sabun % 3;
		switch (team) {
		case 0:
			System.out.println("A팀입니다.");
			break;
		case 1:
			System.out.println("B팀입니다.");
			break;
		case 2:
			System.out.println("C팀입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		scanner.close();
	}

//[Ex15.java]
//아래와 같은 계산기 프로그램을 작성하세요.
//⚫ 기호, 숫자1, 숫자2 순서로 입력 받습니다.
//⚫ 기호는 ( + - * / ) 4가지 입니다.
//⚫ 입력된 내용으로 계산하여 결과값을 출력합니다.
//⚫ 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
	public static void ex15() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String g = scanner.next();
		System.out.print("숫자1: ");
		double num10 = scanner.nextInt();
		System.out.print("숫자2: ");
		double num11 = scanner.nextInt();
		if (num11 == 0) {
			System.out.println("계산할 수 없습니다.");
		} else {
			switch (g) {
			case "+":
				System.out.println(num10 + num11);
				break;
			case "-":
				System.out.println(num10 - num11);
				break;
			case "*":
				System.out.println(num10 * num11);
				break;
			case "/":
				System.out.println(num10 / num11);
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
			}
		}
		scanner.close();
	}

//		[Ex16.java]
//다음과 같이 정의되는 함수의 함수 값을 계산해보자
//𝒇(𝒙) = {
//𝒙𝟑 − 𝟗𝒙 + 𝟐 , 𝒙 ≤ 𝟎 (𝒙가 𝟎보다 작거나 같으면 이식을 사용)
//𝟕𝒙 + 𝟐 , 𝒙 > 𝟎 (𝒙가 𝟎보다 크면 이식을 사용)
	public static void ex16() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num13 = scanner.nextInt();
		if (num13 <= 0) {
			System.out.println("계산결과는 " + ((num13 * num13 * num13) - (9 * num13) + 2.0) + "입니다.");
		} else {
			System.out.println("계산결과는 " + (7 * num13) + 2.0 + "입니다.");
		}
		scanner.close();
	}

//[Ex17.java]
//다음과 같이 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요
//⚫ 세금계산법
//⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
//⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
//⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
//⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
	public static void ex17() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		int num14 = scanner.nextInt();

		if (num14 >= 0 && num14 <= 1000) {
			System.out.println("소득세는 " + num14 * 0.9 + "입니다.");
		} else if (num14 > 1000 && num14 <= 4000) {
			System.out.println("소득세는 " + (1000 * 0.09 + 0.18 * (num14 - 1000)) + "입니다.");
		} else if (num14 > 4000 && num14 < 8000) {
			System.out.println("소득세는 " + (1000 * 0.09 + 3000 * 0.18 + 0.27 * (num14) - 4000) + "입니다.");
		} else {
			System.out.println("소득세는 " + (1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (num14 - 8000)) + "입니다.");
		}
		scanner.close();
	}

//[Ex18.java]
//알파벳을 입력 받아 자음 모음을 구분하세요.
//⚫ switch~case문을 사용합니다.
//⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
	public static void ex18() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 1글자 (소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		String alp = scanner.next();

		switch (alp) {
		case "a", "e", "i", "o", "u":
			System.out.println("모음입니다.");
			break;
		default: 
			System.out.println("자음입니다.");
			break;
		
		}
		scanner.close();

	}

//[Ex19.java]
//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력
//⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
	public static void ex19() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도:");
		int year = scanner.nextInt();
		int age2 = 2023 - year;
		if (age2 < 15 && age2 >= 65) {
			System.out.println(age2 + "살 무료예방 접종 대상자 입니다.");
		} else {
			System.out.println(age2 + "살 무료예방 접종 대상자가  아닙니다.");
		}
		scanner.close();
	}

//[Ex20.java]
//알파벳을 입력 받아 자음 모음을 구분하세요.
//⚫ if~else문을 사용합니다.
//⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
	public static void ex20() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 1글자 (소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		String alp = scanner.next();
		if (alp == "a" || alp == "e" || alp == "i" || alp == "o" || alp == "u") {
			System.out.println("모음입니다.");
		} else {
			System.out.println("자음입니다.");
		}
		scanner.close();
	}
	//[Ex20.java]
	//사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
	//⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
	//⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
	//(사번 0은 고려하지 않습니다.)
		public static void ex21() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("사번(정수)를 입력해주세요");
			System.out.print("사번: ");
			int sabun = scanner.nextInt();
			int team = sabun % 3;
			switch (team) {
			case 0:
				System.out.println("A팀입니다.");
				break;
			case 1:
				System.out.println("B팀입니다.");
				break;
			case 2:
				System.out.println("C팀입니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			scanner.close();
		}


}
