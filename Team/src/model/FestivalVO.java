package model;

public class FestivalVO {
	
	int fest_no;
	String fest_name;
	String city;
	String fest_tel;
	String fest_date1;
	String fest_date2;
	String fest_contents;
	String fest_contents2;
	String fest_image;
	
	public FestivalVO(int fest_no, String fest_name, String city, String fest_tel, String fest_date1, String fest_date2,
			String fest_contents, String fest_contents2, String fest_image) {
		this.fest_no = fest_no;
		this.fest_name = fest_name;
		this.city = city;
		this.fest_tel = fest_tel;
		this.fest_date1 = fest_date1;
		this.fest_date2 = fest_date2;
		this.fest_contents = fest_contents;
		this.fest_contents2 = fest_contents2;
		this.fest_image = fest_image;
	}
	
	public FestivalVO(String search) {
		this.fest_name = search;
	}
	
	public FestivalVO(String fest_name, String city, String fest_tel, String fest_date1, String fest_date2) {
	}

	public int getFest_no() {
		return fest_no;
	}

	public void setFest_no(int fest_no) {
		this.fest_no = fest_no;
	}

	public String getFest_name() {
		return fest_name;
	}

	public void setFest_name(String fest_name) {
		this.fest_name = fest_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFest_tel() {
		return fest_tel;
	}

	public void setFest_tel(String fest_tel) {
		this.fest_tel = fest_tel;
	}

	public String getFest_date1() {
		return fest_date1;
	}

	public void setFest_date1(String fest_date1) {
		this.fest_date1 = fest_date1;
	}

	public String getFest_date2() {
		return fest_date2;
	}

	public void setFest_date2(String fest_date2) {
		this.fest_date2 = fest_date2;
	}

	public String getFest_contents() {
		return fest_contents;
	}

	public void setFest_contents(String fest_contents) {
		this.fest_contents = fest_contents;
	}

	public String getFest_contents2() {
		return fest_contents2;
	}

	public void setFest_contents2(String fest_contents2) {
		this.fest_contents2 = fest_contents2;
	}

	public String getFest_image() {
		return fest_image;
	}

	public void setFest_image(String fest_image) {
		this.fest_image = fest_image;
	}
	
	

	
	
}


