package com.javaex.basic.types;

public class VarEx {
	public static void main(String[] args) {
		//	변수: 영어, 숫자, $, _ 조합으로 생성
		//		숫자로 시작하면 안됨
		//	관례: 소문자로 작성,
		//		단어의 조합일 경우 뒷 단어의 첫글자는 대문자
		//	선언
		int myAge;
		myAge = 25; // 초기화
		System.out.println(myAge);
		// 한번 정해진 데이터 타입은 변경되지 않는다
		
		
		int v1=10, v2 = 20, v3 = 30;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1 = v2 = v3 = 40;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
