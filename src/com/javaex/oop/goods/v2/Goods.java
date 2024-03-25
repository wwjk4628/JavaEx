package com.javaex.oop.goods.v2;

// v1, 필드
public class Goods {
	// 필드선언
	// instance 영역
	private String name; // 상품명
	private int price; // 가격
	
	// 메서드 영역
	public String getName() { // 게터
		return name;
	}

	public void setName(String name) { // 세터
		this.name = name;
	}

	public int getPrice() { // 게터
		return price;
	}

	public void setPrice(int price) { // 세터
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}

	}

	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품이름: %s %n가격: %,d원%n", this.name, this.price);
	}
}
