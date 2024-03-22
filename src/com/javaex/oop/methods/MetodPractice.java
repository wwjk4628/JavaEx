package com.javaex.oop.methods;

public class MetodPractice {

	public static void main(String[] args) {
//		입력이 없고 출력도 없는 메서드
//		문제1. 콘솔에 “Hello Method!”를 출력하는 메서드를 작성하세요.
		printHelloMethod();

//		문제2. 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
		printNumbers();

//		입력이 없고 출력이 있는 메서드
//		문제3. 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
		int ran = getRandomNumber();
		System.out.println(ran);

//		문제4. 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요
		int sum = getSum();
		System.out.println(sum);

//		입력이 있고 출력은 없는 메서드
//		문제5. 정수를 하나 받아 그 정수가 짝수인지 
//		홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
		printOddOrEven(4);

//		문제6. 문자열을 하나 받아 그 문자열의 길이를
//		콘솔에 출력하는 메서드를 작성하세요
		printStringLengh("aaa");

//		문제7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요
		int big = getLargeNumber(4, 6);
		System.out.println(big);

//		문제8. 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
		System.out.println(concatenateStrings("aaa", "bbb"));

//		문제9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요
		int unnum = sumAll(1, 2, 3, 4);
		System.out.println(unnum);

//		 문제10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요
		System.out.println(concatenateStrings("aaa" + "bbb" + "ccc"));

	}

	private static void printHelloMethod() {
		System.out.println("Hello Method");
	}

	private static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	private static int getRandomNumber() {
		return (int)(Math.random() * 101) + 0;
	}

	private static int getSum() {
		return 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
	}

//	private static void printOddOrEven(int num1) {
//		if (num1 % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//
//	}
	private static void printOddOrEven(int value) {
		//	3항 연산 : 조건식 ? 참일 떄의 값 : 거짓일 때의 값
		System.out.println(value % 2 == 0 ? "짝수" : "홀수");
	}

	private static void printStringLengh(String i) {
		System.out.println(i.length());
	}

	private static int getLargeNumber(int num1, int num2) {
		if (num1 <= num2) {
			return num2;
		} else {
			return num1;
		}
	}

	private static String concatenateStrings(String i, String n) {
		return i + n;
	}

	private static int sumAll(int... value) {
		int result = 0;
		for (int val : value) {
			result += val;
		}
		return result;
	}

	private static String concatenateStrings(String... value) {
		String result = "";
		for (String val : value) {
			result += val;
		}
		return result;
	}
}
