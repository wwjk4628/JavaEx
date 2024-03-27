package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
//	필드
	private String color;
//	생성자
	// 기본 생성자가 없으면 기본생성자를 추가해서 컴파일한다
//	부모생성자 호출  x 기존 부모 생성자 호출
	public ColorPoint(String color) {
//		생성자 내에서 부모 생성자를 호출하지 않으면
//		부모의 기본 생성자를 호출한다.
		super(0,0);
		this.color = color;
	}
//	public ColorPoint(String color) {
//		this.color = color;
//	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	//	getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void draw() {
		//	getter 이용 우회접근
		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n",
				super.xGetter(), super.yGetter(), color);
		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n",
				x, y, color);
	}
	public void draw(boolean bDraw) {
		String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ", x, y, color);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
}
