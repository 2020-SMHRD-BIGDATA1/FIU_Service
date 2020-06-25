package model;

public class ChartVO {

	

	private int rating;
	public ChartVO(int age, int rating) {
		super();
		this.rating = rating;
		this.age = age;
	}
	private int age;
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}




	
}
