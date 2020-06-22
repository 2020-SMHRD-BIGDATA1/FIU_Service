package model;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String location;
	private String sex;
	private String age;

	public MemberVO(String id, String pw, String name, String phone, String location, String sex, String age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.location = location;
		this.sex = sex;
		this.age = age;
	}

	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getlocation() {
		return location;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
