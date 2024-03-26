package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		System.out.println("refCount: " + s1.refCount);
		StaticEx s2 = new StaticEx();
		System.out.println("refCount: " + StaticEx.refCount);
		StaticEx s3 = new StaticEx();
		System.out.println("refCount: " + StaticEx.refCount);

		s3 = null;
		System.out.println("s3 삭제");
		System.out.println("refCount: " + StaticEx.refCount);
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println("refCount: " + StaticEx.refCount);
		} catch (Exception e) {
			
		} 
			
	
	}

}
