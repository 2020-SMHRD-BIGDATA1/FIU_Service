package model;

public class listVO {

	private double score;
	public listVO(double score, String age) {
		super();
		this.score = score;
		this.age = age;
	}
	private String age;
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
