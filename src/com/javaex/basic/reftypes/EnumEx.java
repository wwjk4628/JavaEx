package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		System.out.println(today);
		System.out.printf("Today is %s(%d)%n",
				today.name(),	//문자열
				today.ordinal()); 	//열거 상수의 열거 객채 순번
		String strWeek = "FRIDAY";
		Week obj = Week.valueOf(strWeek);
		System.out.printf("obj is %s(%d)%n",
				obj.name(),
				obj.ordinal());
	}

}
