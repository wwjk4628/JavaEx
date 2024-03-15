package com.javaex.basic.operators;

public class AirthOperEx {

	public static void main(String[] args) {
		//	산술연산
		//arithOperTest();
		//	 증감연산 (디버거)
		incrOperTest();
		//	 할당연산
		assignOperTest();
	}
	
	public static void assignOperTest() {

		int a = 7;
		int b = 3;
		
		a = a + b ;
		System.out.println(a); //10
		a += b;
		System.out.println(a); // 13
		
		
	}
	
	public static void incrOperTest() {
		int a = 10;
		int b;
		
		System.out.println(a);
		b = ++a;
		System.out.println(b);
		System.out.println(a);
		
		a = 10; // 원상복구
		System.out.println(a);
		b = a++;
		System.out.println(b);
		System.out.println(a);
		
		
	}
	
	public static void arithOperTest() {
		int a = 7;
		int b = 3;
		
		// 부호연산 (+, -)
		System.out.println(-a);
		System.out.println("----------------");
		
		// 사칙연산 (+, -, *, /, %)
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println("----------------");
		
		//	정수의 나눗셈은 정수다
		System.out.println(a / b);
		System.out.println((float)a / (float)b);
		System.out.println(a / (float)b);
		System.out.println((float)a / b);
	}
	

}
