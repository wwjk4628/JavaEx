package com.javaex.practice05;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1341.30); //	환율 세팅
        
        //100만원을 달러로 출력하기
        won = 1000000;
        System.out.println(CConverter.toDollar(won));
        dollar = CConverter.toDollar(won);
        System.out.println(dollar);
        //100달려를 원으로 출력하기
        dollar = 100;
        System.out.println(CConverter.toKWR(dollar));
        won = CConverter.toKWR(dollar);
        System.out.println(won);
    }

}
