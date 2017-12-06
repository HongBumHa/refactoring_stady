package kr.or.dgit.refactoring_stady;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String title;
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	public double getCharge(int aDaysRented) {
		double result = 0;
		switch(getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(aDaysRented>2) {
				result += (aDaysRented -2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += aDaysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(aDaysRented >3) {
				result += (aDaysRented -3) * 1.5;
				break;
			}
		}
		return result;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		if((getPriceCode() == Movie.NEW_RELEASE) && daysRented >1) {
			return 2;
		}else {
			return 1;
		}
	}
}