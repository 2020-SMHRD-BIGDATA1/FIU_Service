package model;

public class FestivalVO {
	public int getFEST_NO() {
		return FEST_NO;
	}

	public void setFEST_NO(int fEST_NO) {
		FEST_NO = fEST_NO;
	}

	public String getFEST_NAME() {
		return FEST_NAME;
	}

	public void setFEST_NAME(String fEST_NAME) {
		FEST_NAME = fEST_NAME;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getFEST_TEL() {
		return FEST_TEL;
	}

	public void setFEST_TEL(String fEST_TEL) {
		FEST_TEL = fEST_TEL;
	}

	public String getFEST_DATE() {
		return FEST_DATE;
	}

	public void setFEST_DATE(String fEST_DATE) {
		FEST_DATE = fEST_DATE;
	}

	int FEST_NO;
	String FEST_NAME;
	String CITY;
	String FEST_TEL;
	String FEST_DATE;
	
	public FestivalVO(int fEST_NO, String fEST_NAME, String cITY, String fEST_TEL, String fEST_DATE) {
		super();
		FEST_NO = fEST_NO;
		FEST_NAME = fEST_NAME;
		CITY = cITY;
		FEST_TEL = fEST_TEL;
		FEST_DATE = fEST_DATE;
	}
	
	
}


