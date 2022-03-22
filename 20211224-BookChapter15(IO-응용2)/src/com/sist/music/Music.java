package com.sist.music;

import java.io.Serializable;

// �������� ����ϴ� �������� (����� ����)
// ���� 1���� ���� ��� �ִ� 
// implements Serializable : ��ü ������ ���� (����=>����) ����ȭ 
public class Music implements Serializable{
    private int no;//rank,no
    private int idcrment; // increment,decrement
    private String state; // ���� - , ��� , �ϰ� 
    private String title;
    private String singer;
    private String album;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getIdcrment() {
		return idcrment;
	}
	public void setIdcrment(int idcrment) {
		this.idcrment = idcrment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
