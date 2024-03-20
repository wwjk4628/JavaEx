package com.javaex.basic.loop;

public class BreakEx {
//	6과 14로 모두 나누어 떨어지는 숫자 찾기
//	반복 횟수를 정확하게 알기 힘든 경우 => while
	public static void main(String[] args) {
//		ex1();
		ex2();
//		ex3();
//		ex4();
//		ex5();
	}
	public static void ex1(){
	int i = 1;
	while (i%6 != 0 || i%14 !=0) {
		i += 1;
	}
	System.out.println(i);
	}
	
	public static void ex2() {
		int num = 1;
		while(true) {
			if (num % 6 == 0 && num % 14 ==0) {
				break;
			}
			num += 1;
		}
		System.out.println(num);
	}
	public static void ex3() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		while (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || 
				num2 == num3 || num2 == num4 || num2 == num5 || 
				num3 == num4 || num3 == num5 ||
				num4 == num5) {
			num1 = (int)(Math.random()*45)+1;
			num2 = (int)(Math.random()*45)+1;
			num3 = (int)(Math.random()*45)+1;
			num4 = (int)(Math.random()*45)+1;
			num5 = (int)(Math.random()*45)+1;
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

	}
	public static void ex4() {
		int i = 0;
		int num = 0;
		while (i < 5) {
			num = (int)(Math.random()*45)+1;
			System.out.print(num + " ");
			i += 1;
		}
	}
	public static void ex5() {
		int num = 0;
		for (int i = 0; i < 5; i++) {
			num = (int)(Math.random()*45)+1;
			System.out.print(num + " ");
		}
		
	}
	
}
