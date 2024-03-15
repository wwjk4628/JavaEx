package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		//	암시적 캐스팅 (Promotion)
		promotionEx();
		castingEx();
		// 	명시적 캐스팅 (casting) 

	}
	public static void castingEx() {
		// 표현 자료가 넓은 자료형 -> 좁은 자료형으로의 변형
		// 데이터의 유실 위험 -> 반드시 강제로 타입 변환이 필요
		
		double d = 1234567.890;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		int i = (int)1;
		System.out.println(Integer.toBinaryString(i));
		
		short s = (short)l;
		System.out.println(s);
		
	}
	public static void promotionEx() {
		// 표현 범위가 좁은 자료형 -> 넓은 자료형으로의 변환
		// 암묵적으로 자동으로 캐스팅을 수행
		// byte -> short -> int -> long
		// -> float -> double
		byte b = 25; // 1바이트 정수형
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		short s2 = (short)ch;
		System.out.println(s2);
	}

}
