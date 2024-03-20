package com.javaex.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
//		ex6();
//		ex7();
		ex8();
	}

	public static void ex1() {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		intArray[3] = 12;
		intArray[4] = 12;

		int result = 0;

		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}
//[문제] Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문
//을 작성하세요.
	public static void ex2() {
		double Array[] = {
				1.2, 3.3, 6.7
		};
		for (int i = 2; i >= 0; i--) {
			System.out.println(Array[i]);
		}

	}
//	[문제] Ex03 아래코드의 출력 값을 예상하고 코드로 확인해 보세요.

	public static void ex3() {
		int[] intA = { 3, 6, 9};
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
		//20
		//6
		//10

	}
//[문제] Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로
//그램을 작성하세요.
//int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };


	public static void ex4() {
		int data[]= { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int result = 0;
		int num = 0;
		for(int i = 0; i < data.length; i++) {
			if( data[i] % 3 == 0) {
				num++;
				result += data[i];
			}
		}
		System.out.println(num);
		System.out.println(result);

	}
//	[문제] Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
	public static void ex5() {
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		double num3 = scanner.nextInt();
		double num4 = scanner.nextInt();
		double num5 = scanner.nextInt();
		double result = (num1+num2+num3+num4+num5)/5;
		System.out.println("평균은 " + result + "입니다.");
		scanner.close();
		

	}
//[문제] Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
//char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};

	public static void ex6() {
		char c[] = {'T','h','i','s',',','i','s',',','a',',','p','e','n','c','i','l'};
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
//[문제] Ex07 키보드에서 정수로 된 돈의 액수를 입력 받아 50000원권, 10000원권, 5000원권, 1000원권, 500원
//동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)


	public static void ex7() {
		Scanner scanner = new Scanner(System.in);
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		System.out.println("금액: ");
		int price = scanner.nextInt();
		for (int i = 0; i < wonArray.length; i++) {
			System.out.printf("%d원: %d개%n", wonArray[i], price/wonArray[i]);
			price = price -(wonArray[i])*(price/wonArray[i]);
		}
		scanner.close();

	}
//	[문제] Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
//	(중복체크 할 것)
	public static void ex8() {
		int l[] = new int[6];
		for (int i = 0; i < l.length; i++) {
			l[i] = (int)(Math.random()*6)+1;
			for (int j = 0; j < i; j++) {
				if(l[i] == l[j]) {
					j = 0;
					l[i] = (int)(Math.random()*6)+1;
					continue;
				}
				
			}
			System.out.println(l[i]);
		}
		
		

	}

}
