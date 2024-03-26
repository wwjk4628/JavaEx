package com.javaex.practice05;

public class StringUtil {
    
    public static String concatString(String[] strArray ){
       String mov = new String();
       for (String str : strArray) {
    	   mov += str;
       }
        //메소드 내용작성
    	return mov;
    }

}
