package com.javaex.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
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

	}

	public static void ex6() {
//	[Ex06.java]
//1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
		int i;
		int a;
		int b;
		for (i = 1; i < 100; i++) {
			a = i % 5;
			b = i % 7;
			if (a == 0 && b == 0) {
				System.out.println(i);
			}
		}
//		[Ex07.java]
//				숫자를 입력 받아 아래와 같이 출력하세요
	}

	public static void ex7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("");
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		scanner.close();

	}

//	[Ex08.java]
//			아래와 같이 구구단을 출력하세요
	public static void ex8() {
		for (int i = 1; i <= 9; i++) {
			for (int n = 2; n <= 9; n++) {
				System.out.print(n + "*" + i + "=" + n * i + "\t");
			}
			System.out.println("");
		}

	}

//	[Ex09.java]
//			다음과 같이 출력하세요
	public static void ex9() {
		for (int i = 1; i <= 10; i++) {
			for (int n = i; n <= i + 9; n++) {
				System.out.print(n + "\t");
			}
			System.out.println("");
		}

	}

//	[Ex10.java]
//			정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	public static void ex10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1:");
		int num1 = scanner.nextInt();
		System.out.print("숫자2:");
		int num2 = scanner.nextInt();
		System.out.print("숫자3:");
		int num3 = scanner.nextInt();
		System.out.print("숫자4:");
		int num4 = scanner.nextInt();
		System.out.print("숫자5:");
		int num5 = scanner.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("가장 큰수는 " + num1 + " 입니다.");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("가장 큰수는 " + num2 + " 입니다.");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("가장 큰수는 " + num3 + " 입니다.");
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("가장 큰수는 " + num4 + " 입니다.");
		} else {
			System.out.println("가장 큰수는 " + num5 + " 입니다.");
		}
		scanner.close();
	}

//	[Ex11.java]
//다음과 같은 프로그램을 작성하세요
//a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
//- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
//- 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
	public static void ex11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		int sum = 0;
		if (n % 2 == 0) {
			for (int j = 2; j <= n; j += 2) {
				sum += j;
			}
		} else {
			for (int j = 1; j <= n; j += 2) {
				sum += j;
			}
		}
		System.out.println(sum);
		scanner.close();
	}

//	[Ex12.java]
//팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력 받아 팩토리얼 값을 출력하세요.
//5 입력시 1*2*3*4*5 의 값이 출력됩니다.
//7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
//팩토리얼 공식 𝐧! = 𝟏 × 𝟐 × 𝟑 × ⋯ × n
	public static void ex12() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		int p = 1;
		for (int i = 1; i < n; i++) {
			p += p * i;
		}
		System.out.println(p);

		scanner.close();
	}

//[Ex13.java]
//아래와 설명에 맞는 프로그램을 작성하세요
//숫자를 1개 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
//예를 들어 100을 입력 받는다면 아래와 같이 계산됩니다.
	public static void ex13() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		int p = 0;
		for (int i = 1; i <= n; i++) {
			p += i;
		}
		System.out.println(p);
		scanner.close();
	}

//	[Ex14.java]
//			13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.
	public static void ex14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		int p = 0;
		for (int i = 1; i <= n; i++) {

			p += i;
		}
		System.out.print("1");
		for (int j = 2; j <= n; j++) {
			System.out.print("+" + j);
		}
		System.out.println("");
		System.out.println(p);
		scanner.close();
	}

//	[Ex15.java]
//			아래와 설명에 맞는 프로그램을 작성하세요
//			숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요
//			예를 들어 10을 입력한 경우 1, 2, 5, 10 이 출력된다.
	public static void ex15() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}

//	[Ex16.java]
//			아래와 설명에 맞는 프로그램을 작성하세요
//			숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
//			예를 들어 22을 입력한 경우 5의배수 개수: 4, 5의배수 합: 50 이 출력된다.
//			- 5의배수 개수 : 5, 10, 15, 20 → 4개
//			- 5의배수 합 : 5+10+15+20 → 50
	public static void ex16() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = scanner.nextInt();
		int result = 0;
		System.out.println("5의배수의 개수: " + n / 5 + "개");

		for (int i = 5; i <= n; i += 5) {
			result += i;
		}
		System.out.println("5의배수의 합: " + result);

		scanner.close();
	}

//	[Ex17.java]
//			숫자 하나를 입력 받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.	
	public static void ex17() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = scanner.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();
	}

//	[Ex18.java]
//			숫자 하나를 입력 받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
	public static void ex18() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = scanner.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();

	}

//	[Ex19.java]
//			아래와 같이 은행 프로그램을 작성하세요
//			“1.예금” 선택 후 금액을 입력하면 예금액이 합산됩니다.
//			“2.출급” 선택 후 금액을 입력하면 예금액이 차감됩니다.
//			“3.잔고” 선택 시 현재 잔고가 출력됩니다.
//?			“4.종료” 선택 시 종료됩니다.
//			“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
	public static void ex19() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------------");
		int n = 0;
		System.out.print("선택>");
		int i = scanner.nextInt();
		while (i != 4) {
		switch (i) {
		case 1:
			System.out.print("예금액>");
			n += scanner.nextInt();
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			i = scanner.nextInt();
			break;
		case 2:
			System.out.print("출금액>");
			n -= scanner.nextInt();
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			i = scanner.nextInt();
			break;
		case 3:
			System.out.println("잔고액>" + n);
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			i = scanner.nextInt();
			break;
		case 4:
			 System.out.println("프로그램을 종료합니다.");
			 scanner.close();
			 return;
		default:
			System.out.println("1, 2, 3, 4 이외의 숫자입니다. 다시 입력해주세요.");
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			i = scanner.nextInt();
			break;
		}
	}
		scanner.close();
	}
//	[Ex20.java]
//			아래와 설명에 맞는 프로그램을 작성하세요
//			숨겨진 숫자를 맞추는 게임입니다.
//			프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
//			사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
//			사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
//			정답을 맞춘 경우 “맞았습니다.” 출력됩니다.
//			게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
//			(y 인 경우 다시 게임이 시작됩니다.)
//			*개발시 랜덤하게 생성된 값을 출력해서 테스트 하면 편리합니다
	public static void ex20() {
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		System.out.println("===================================");
		System.out.println("\t [숫자맞추기게임 시작]");
		System.out.println("===================================");
		int i = 0;
		System.out.print(">>");
		i = scanner.nextInt();
		while (true) {
		if (i == num) {
			System.out.println("게임을 종료하시겠습니까?(y/n) >>");
			String j = scanner.next();
			switch (j) {
			case "y" :
				System.out.println("===================================");
				System.out.println("\t [숫자맞추기게임 종료]");
				System.out.println("===================================");
				scanner.close();
				return;
			case "n" :
				num = (int)(Math.random()*100)+1;
				System.out.println("===================================");
				System.out.println("\t [숫자맞추기게임 시작]");
				System.out.println("===================================");
				i = 0;
				System.out.print(">>");
				i = scanner.nextInt();
				break;
			}
			
			
		} else if (i < num) {
			System.out.println("더 높게");
			System.out.print(">>");
			i = scanner.nextInt();
		} else if (i > num) {
			System.out.println("더 낮게");
			System.out.print(">>");
			i = scanner.nextInt();
		}
		}
}
	}
