package com.javaex.oop.shape.v1;

//	추상클래스
//	자신이 객체화 될 수는 업다.
//	오로지 상속을 위한 클래스로만 존재
// 	안쪽에 추상 매서드를 가져야 한다.
//	추상클래스를 상속받은 클래스는 선언된 추상 매서드를 반드시 구현해줘야한다.
public abstract class Shape {
	private int x;
	private int y;
	
	//	생성자
	public Shape (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 추상 매서드
	public abstract double area();
	
	public abstract void draw();

}
