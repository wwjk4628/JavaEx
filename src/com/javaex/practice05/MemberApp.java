package com.javaex.practice05;

public class MemberApp {

	public static void main(String[] args) {
		Member yjs = new Member();
		Member jws = new Member();
		Member lhr = new Member();
		yjs.setName("유재석");
		yjs.setId("yjs");
		yjs.setPoint(30000);
		yjs.showInfo();
		jws.setName("정우성");
		jws.setId("jws");
		jws.setPoint(50000);
		jws.showInfo();
		lhr.setName("이효리");
		lhr.setId("lhr");
		lhr.setPoint(40000);
		lhr.showInfo();
		
	}

}
