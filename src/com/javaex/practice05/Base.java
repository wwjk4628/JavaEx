package com.javaex.practice05;

public class Base {
	
    
    public void service(String state) {
        if (state == "낮") {
        	day();
        } else if (state == "밤"){
        	night();
        } else {
        	afternoon();
        }
        //코드작성할것
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    	//코드작성할것
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

