package com.javaex.oop.song.v3;

public class SongApp {

	public static void main(String[] args) {
		Song IU = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
//		Song IU = new Song();	// 생성자 
//		IU.setTitle("좋은날");
//		IU.setArtist("아이유");
//		IU.setAlbum("Real");
//		IU.setComposer("이민수");
//		IU.setYear(2010);
//		IU.setTrack(3);
		IU.showInfo();
		Song BIG = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		
//		Song BIG = new Song();
//		BIG.setTitle("거짓말");
//		BIG.setArtist("BIGBANG");
//		BIG.setAlbum("Always");
//		BIG.setComposer("G-DRAGON");
//		BIG.setYear(2007);
//		BIG.setTrack(2);
		BIG.showInfo();
		Song BUS = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);

//		Song BUS = new Song();
//		BUS.setTitle("벛꽃엔딩");
//		BUS.setArtist("버스커버스커");
//		BUS.setAlbum("버스커버스커1집");
//		BUS.setComposer("장범준");
//		BUS.setYear(2012);
//		BUS.setTrack(4);
		BUS.showInfo();
	}

}
