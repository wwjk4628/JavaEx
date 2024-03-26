package com.javaex.oop.tv.v1;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);
		
		tv.statue();
		
		tv.power( true );
		tv.volume( 120 );
		tv.statue();
		
		tv.volume( false );
		tv.statue();
		
		tv.channel( 0 );
		tv.statue();
		tv.channel( true );
		tv.channel( true );
		tv.channel( true );
		tv.statue();
		
		tv.power( false );
		tv.statue();
	}

}
