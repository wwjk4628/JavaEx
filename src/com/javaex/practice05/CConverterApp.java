package com.javaex.practice05;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        won = 1000000;
        System.out.println(CConverter.toDoller(won));
        //100달려를 원으로 출력하기
        dollar = 100;
        System.out.println(CConverter.toKWR(dollar));
        
    }

}
