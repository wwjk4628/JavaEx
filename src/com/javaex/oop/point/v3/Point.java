package com.javaex.oop.point.v3;

//	v3 메서드 오버로딩
//	메서드 시그니처 : 반환타입, 이름은 같고
// 				매개변수의 타입, 순서, 개수만 다른 메서드

public class Point {
	// 필드 (은닉)
	private int x;
	private int y;

	
	// getters/setters
	public int xGetter() {
		return x;
	}

	public void xSetter(int x) {
		this.x = x;
	}

	public int yGetter() {
		return y;
	}

	public void ySetter(int y) {
		this.y = y;
	}

	// 출력을 위한 일반 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	// 메서드 오버로딩
	//		boolean bDraw => true면 그렇습니다. => false면 지웠습니다.
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을 ", x, y);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
		
	}
}
