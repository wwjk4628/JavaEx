package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		Circle rad = new Circle (10, 20, 30);
		Rectangle rac = new Rectangle(10, 20, 100, 500);
		
		rac.draw();
		rad.draw();
	}

}
