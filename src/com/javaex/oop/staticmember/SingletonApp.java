package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	
		System.out.println("s1= " + s1);
		System.out.println("s2= " + s2);
		
		//	둑 객체가 같은 객체인가?
		System.out.println(s1 == s2);
		
	}

}
