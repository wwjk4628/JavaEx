package com.javaex.basic.loop;

import java.util.Scanner;

public class whileGugu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단 :");
		int dan = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i += 1;
			
		}
		scanner.close();
		

	}

}
