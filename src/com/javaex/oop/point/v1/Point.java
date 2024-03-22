package com.javaex.oop.point.v1;

public class Point {
	
	private int x;
	private int y;
	
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
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", this.x, this.y);
	}

}
