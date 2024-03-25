package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point first = new Point();
		first.xSetter(5);
		first.ySetter(5);
		first.draw();
		Point second = new Point();
		second.xSetter(10);
		second.ySetter(23);
		second.draw();
		// 	오버로딩 메서드 호출
		first.draw(true);
		second.draw(false);
		

	}
}
