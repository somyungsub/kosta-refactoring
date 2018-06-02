package code.refactoring.complex_3;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	
	public double getRentalCharge() {
		double thisAmount = 0.0;
		switch(getMovie().getPriceCode()) {
		case Movie.REQULAR:
			thisAmount += 2;
			if(getDaysRented() > 2)
				thisAmount += (getDaysRented()-2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount += (getDaysRented()) * 3;
			break;
		case Movie.CHILDERNS:
			thisAmount += 1.5;
			if(getDaysRented() > 3)
				thisAmount += (getDaysRented()-3) * 1.5;
			break;
		}
		return thisAmount;
	}

	public int getFrequentPoint() {
		int frequentRenterPoints = 0;
		// 적립포인트를 1포인트 증가
		frequentRenterPoints ++;
		
		// 최신물을 이틀이상 대여하면 보너스포인트 지급
		if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
			frequentRenterPoints ++;
		}
		
		return frequentRenterPoints;
	}
}
