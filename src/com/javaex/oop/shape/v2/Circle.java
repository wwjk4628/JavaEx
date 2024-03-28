package com.javaex.oop.shape.v2;
//	 인터ㅠㅔ이스 내의 모든 추상 메서드는 반드시 구현해야 한다.
public class Circle extends Shape implements Drawable{
//	Shape s = new Shape();	//	추상클래스는 직접 객체화 불가
	private double radious;
	
	public Circle(int x, int y, double radious) {
		super(x, y);
		this.radious = radious;
	}
	
	//	부모가 선언한 추상메서드는 반드시 구현해야 한다.
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸어요%n",
				super.getX(), super.getY(), radious, area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radious, 2);
		return area;
	}
	
	

}
