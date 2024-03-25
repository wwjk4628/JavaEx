package com.javaex.oop.goods.v4;

// v4. this
//	현재 자기자신의 객체를 의미
//	this()
public class Goods {
	// 필드선언
	// instance 영역
	private String name; // 상품명
	private int price; // 가격
	
	// 	name 필드 생성자
	public Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	//	전체 필드 생성자
	public Goods(String name, int price) {
		//	객체 초기화를 담당
		this(name);	//	=> Goods(String name) 생성자 호출
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
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
