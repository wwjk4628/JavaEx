package com.javaex.oop.goods.v3;

// v1, 필드
public class Goods {
	// 필드선언
	// instance 영역
	private String name; // 상품명
	private int price; // 가격
	
	//	생성자를 하나도 선언하지 않을 경우
	// 	자바 컴파일러가 기본 생성자 추가한다
	// 	개발자가 생성자르 만들었을 경우,
	//	기본생성자는 추가되지 않는다.
	//	생성자

	public Goods(String name, int price) {
		//	객체 초기화를 담당
		this.name = name;
		this.price = price;
	}
	
	
	// 메서드 영역
	//	Setter가 없으면 Read Only 필드를 만들 수 있고,
	//	Getter/Setter 모두 없으면 프라이빗 필드가 된다.
	public String getName() { // 게터
		return name;
	}

//	public void setName(String name) { // 세터
//		this.name = name;
//	}

	public int getPrice() { // 게터
		return price;
	}

//	public void setPrice(int price) { // 세터
//		if (price < 0) {
//			this.price = 0;
//		} else {
//			this.price = price;
//		}
//
//	}

	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품이름: %s %n가격: %,d원%n", this.name, this.price);
	}
}
