package model;

public class ReviewVO {
	
	String rev_no;		// �ı��ȣ
	String city;	// ����
	String rev_with;	// �ı�
	String age;			// ����
	String rev_score;	// ����
	String rev_date;	//��¥
	
	
	public ReviewVO(String rev_no, String city, String rev_with, String age, String rev_score, String rev_date) {
		super();
		this.rev_no = rev_no;
		this.city = city;
		this.rev_with = rev_with;
		this.age = age;
		this.rev_score = rev_score;
		this.rev_date = rev_date;
	}


	public String getRev_no() {
		return rev_no;
	}


	public void setRev_no(String rev_no) {
		this.rev_no = rev_no;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getRev_with() {
		return rev_with;
	}


	public void setRev_with(String rev_with) {
		this.rev_with = rev_with;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getRev_score() {
		return rev_score;
	}


	public void setRev_score(String rev_score) {
		this.rev_score = rev_score;
	}


	public String getRev_date() {
		return rev_date;
	}


	public void setRev_date(String rev_date) {
		this.rev_date = rev_date;
	}
	
	


}
