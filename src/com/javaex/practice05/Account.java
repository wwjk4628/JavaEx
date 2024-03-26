package com.javaex.practice05;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    //필요한 메소드 작성
    public void deposit(int money) {
    	if (money >= 0) {
    	balance += money;
    	} else {
    		System.out.println("다시 해주세요");
    	}
    }
    public void withdraw(int money) {
    	if (money >= 0) {
    	balance += money;
    	} else {
    		System.out.println("다시 해주세요");
    	}
    }
    public void showBalance() {
    	System.out.println(balance);
    }

}
