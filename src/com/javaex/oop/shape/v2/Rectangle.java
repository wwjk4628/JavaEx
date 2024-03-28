package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸어요%n",
				super.getX(),
				super.getY(),
				width,
				height,
				area());
	}
	
	public double area() {
		return width * height;
	}

	

}
