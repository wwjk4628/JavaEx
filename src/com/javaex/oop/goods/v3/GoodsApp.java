package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {

//		Goods camera = new Goods();
		Goods camera = new Goods("니콘", 400_000);
		
//		camera.setName("니콘");
//		camera.setPrice(40_000);
		Goods notebook = new Goods("LG그램", 900_000);
		
//		Goods notebook = new Goods();
//		notebook.setName("LG그램");
//		notebook.setPrice(900000);
		Goods cup = new Goods("머그컵", 2000);
		
//		Goods cup = new Goods();
//		cup.setName("머그컵");
//		cup.setPrice(2000);
		
		// 상품 정보 출력
		camera.showInfo();
		notebook.showInfo();
		cup.showInfo();
//		System.out.println("========================");
//		System.out.printf("상품이름: %s %n가격: %,d원%n", camera.getName(), camera.getPrice());
//		System.out.printf("상품이름: %s %n가격: %,d원%n", notebook.getName(), notebook.getPrice());
//		System.out.printf("상품이름: %s %n가격: %,d원%n", cup.getName(), cup.getPrice());
	}

}
