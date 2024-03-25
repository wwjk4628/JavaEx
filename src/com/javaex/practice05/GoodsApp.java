package com.javaex.practice05;


public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);

		Goods notebook = new Goods();
		notebook.setName("LG그램");
		notebook.setPrice(900000);

		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		// 상품 정보 출력
		camera.showInfo();
		notebook.showInfo();
		cup.showInfo();
		
	}

}


