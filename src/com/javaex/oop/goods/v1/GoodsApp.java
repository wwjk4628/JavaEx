package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods camera = new Goods();
		
		Goods notebook = new Goods();
		
		Goods cup = new Goods();
		
		notebook.name = "LG그램";
		notebook.price = 900000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		camera.name = "nikon";
		camera.price = 400000;
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n", 
				camera.name,
				camera.price);
		System.out.printf("%s, %,d원%n", 
				notebook.name,
				notebook.price);
		System.out.printf("%s, %,d원%n", 
				cup.name,
				cup.price);
	}

}
