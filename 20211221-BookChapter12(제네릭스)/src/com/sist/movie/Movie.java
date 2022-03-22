package com.sist.movie;
// ��ȭ �Ѱ��� ���� ������ ������ �ִ� Ŭ���� 
// �ڹ� => ��ȭ �������� (�������� �ʴ´�)
// ����� ���Ƿ� ����� �������� 
// => MyBatis (MovieDTO) , Spring(MovieVO) , JSP(MovieBean)
// => ������ ���� , �ٸ� ������ �Ұ����ϰ� ������ ��ȣ (ĸ��ȭ)
public class Movie {
    private int no; // ���� ���� 
    private String title;
    private double score;
    private String reserve;
    private String story;
    private String regdate;
    public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
