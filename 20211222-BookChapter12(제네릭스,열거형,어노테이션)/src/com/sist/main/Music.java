package com.sist.main;
// => �����͸� ��Ƽ� ���� => �����Ͱ� ����,������� => ĸ��ȭ 
// => ������ : �б�/���� => �޼ҵ带 �̿��ؼ� �б�/���� �����ϰ� ����� 
// => getXxx() , setXxx() => getter/setter
// �����Ѱ��� ���� ���� => ������� ���� �������� 
// �Ѱ��� ���ǿ� ���� ������ ��Ƽ� ���� 
// MusicVO , MusicDTO
public class Music {
    private int rank;
    private String title;
    private String singer;
    private String album;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	   
   
   
}
