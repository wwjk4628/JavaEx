package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayCopyEx {
	// 배열은 크기 변경 불가
	// 공간을 늘리고자 한다면 새 배열을 생성 후 복사
	public static void main(String[] args) {
		// For 문을 이용한 배열 복사
//		arrayCopyByFor();
		// Systme을 이용한 배열 복사
		arrayCopyBySystem();
		
	}
	public static void arrayCopyByFor() {
		int[] intArray = { 1, 2, 3};	// .length == 3
		System.out.println(intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		int[] newArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			newArray[i] = intArray[i];
		}
		//	배열 유틸리티 클래스를 이용한 풀력
		System.out.println(Arrays.toString(newArray));
		
		
	}
	public static void arrayCopyBySystem() {
		
		int[] intArray = { 1, 2, 3};	// .length == 3
		System.out.println(intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		int[] newArray = new int[10];
		
		System.arraycopy(intArray, 0, 
				newArray, 3,
				intArray.length);

		//	배열 유틸리티 클래스를 이용한 풀력
		System.out.println(Arrays.toString(newArray));
		
		// Enhanced For Loop
		// for (추출된 데이터: 원본 배열 혹은 컬렉션
		for (int value: newArray) {
			System.out.print(value + "\t");
		}
		System.out.println();
		
	}


}
