package model;

public class ChartVO {
	private String division;
	private int usage;
	private String month;
	
	public ChartVO(String division, int usage, String month) {
		super();
		this.division = division;
		this.usage = usage;
		this.month = month;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getUsage() {
		return usage;
	}

	public void setUsage(int usage) {
		this.usage = usage;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
}
