package com.javaex.practice05;

public class Book {
	
	int bookNo;
    String title;
    String author;
    int stateCode;

    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	this.stateCode = 1;
    }
    public int getBookNo() {
		return bookNo;
	}
    public String getTitle() {
		return title;
	}
    public String getAuthor() {
		return author;
	}
    public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
    public void setTitle(String title) {
		this.title = title;
	}
    public void setAuthor(String author) {
		this.author = author;
	}

	
    public void rent(int num) {
    	this.stateCode = 0;
    }
    
    public void print() {
    		System.out.printf("%d 책 제목:%s, 작가:%s, 대여 유무:",
    				this.bookNo,
    				this.title,
    				this.author
    				);
    		if (stateCode == 0) {
    			System.out.println("대여중");
    		} else {
    			System.out.println("재고있음");
    		}
    	}
    
    	
    }
    
    

