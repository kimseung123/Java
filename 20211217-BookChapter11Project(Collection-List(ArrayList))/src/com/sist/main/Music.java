package com.sist.main;
// ���� ������ ��Ƶд� (���� �Ѱ��� ���� ����)
/*
 *   Ŭ������ ���� ���� ==> ���α׷� ����ñ��� �޸𸮸� ���� 
 *   => �ʿ�ø��� Ŭ���� ���� Ȱ�� => ������� 
 *   => ������ ������ ������ => Ŭ������ ��Ƽ� ó�� (����� ���� ��������)
 *   
 *   1) ����
 *   2) ������ 
 *   3) �뷡�� 
 *   4) ������
 *   5) �ٹ�
 *   6) ���� 
 *   7) ���� (���� / ��� / �ϰ�) => �� ��
 *   
 *   => ����
 *   �迭 ==> 7�� -> 50�� => 350�� 
 *   => Ŭ���� ==> 50�� ���� 
 *   
 *   Ŭ���� => ������� (ĸ��ȭ ==> ����(private), �޼ҵ带 ���ؼ� ������ ����)
 *           
 */
// ����ڰ� �ʿ信 ���ؼ� ���������� ���� ��� (����� ���� ��������)
// ��� : �б� / ���� ==> getter/setter
// ���α׷��� �°� ���� ���� => �����͸� ��Ƽ� ���� ==> ~VO , ~DTO
public class Music {
    private int rank;
    private String poster;
    private String title;
    private String singer;
    private String album;
    private int idcrement;
    private String state;
    // ���� , ���� 
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
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
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
   
}










