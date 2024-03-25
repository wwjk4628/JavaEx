package com.javaex.oop.point.v2;

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
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", this.x, this.y);
	}
}
