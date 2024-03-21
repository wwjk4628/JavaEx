package com.javaex.oop.goods.v2;

// v1, 필드
public class Goods {
	// 필드선언
	private String name;	//	상품명 
	private int price;		//	가격
	
	public Goods(){ }
	public Goods(String name, int price){
		this.name = name;  // 매개변수로 받은 name을 필드에 할당
        this.price = price;
		}
	public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
	

}
