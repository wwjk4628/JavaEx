package com.javaex.oop.goods.v2;

// v1, 필드
public class Goods {
	// 필드선언
	private String name;	//	상품명 
	private int price;		//	가격
	
	public Goods(){ }	// 기본생성자
	
	public Goods(String name, int price){	// 모듵필드 생성자
		this.name = name;  
        this.price = price;
		}
	public String getName() {	//게터
        return name;
    }
    
    public void setName(String name) {	//세터
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
	

}
