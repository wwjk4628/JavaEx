package com.javaex.practice05;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        String n1 = new String();
        String h = new String();
        String sch = new String();
        //for문 시작
        for (int i = 0; i < 3; i++) {
        	System.out.print("이름: ");
        	n1 = sc.next();
        	System.out.print("휴대폰: ");
        	h = sc.next();
        	System.out.print("학교: ");
        	sch = sc.next();
        	Friend friend = new Friend();
        	friend.setName(n1);
        	friend.setHp(h);
        	friend.setSchool(sch);
        	friendArray[i] = friend;
        	
        	
        }
        //친구정보 3명 입력 로직 --> 반복문 사용
            
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            System.out.print(friendArray[i].getName());
            System.out.print(friendArray[i].getHp());
            System.out.print(friendArray[i].getSchool());
        }

        sc.close();
    }

}
