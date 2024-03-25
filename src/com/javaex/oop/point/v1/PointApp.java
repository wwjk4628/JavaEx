package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point first = new Point(5, 5);
//		Point first = new Point();
//		first.xSetter(5);
//		first.ySetter(5);
		first.draw();
		Point Second = new Point(10, 23);
//		Point Second = new Point();
//		Second.xSetter(10);
//		Second.ySetter(23);
		Second.draw();

	}
}
