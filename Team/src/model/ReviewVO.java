package model;

public class ReviewVO {
	
	String rev_no;		// 후기번호
	String fest_name;	// 지역
	String rev_con;	// 후기
	String age;			// 연령
	String rev_score;	// 평점
	String rev_date;	//날짜
	
	
	public ReviewVO(String rev_no, String fest_name, String rev_con, String age, String rev_score, String rev_date) {
		super();
		this.rev_no = rev_no;
		this.fest_name = fest_name;
		this.rev_con = rev_con;
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


	public String getfest_name() {
		return fest_name;
	}


	public void setfest_name(String fest_name) {
		this.fest_name = fest_name;
	}


	public String getRev_con() {
		return rev_con;
	}


	public void setRev_con(String rev_con) {
		this.rev_con = rev_con;
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
